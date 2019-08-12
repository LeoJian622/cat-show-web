package xyz.foolcat.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;
import xyz.foolcat.model.SysUserInfo;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * jwt工具包
 *
 * @author 李永键
 * @create 2019-08-12 15:30
 */

@Component
public class JwtUtils {

    @SuppressWarnings("unchecked")
    private Map<String, Object> JWT_HEADER = new HashMap<String, Object>() {
        {
            put("alg", "HS256");
            put("typ", "JWT");
        }
    };
    private String ISSUER = "XYZ.FOOLCAT";
    private String SUBJECT = "API AUTHENTICATION";
    private String AUDIENCE = "WECHAT-MINI-PROGRAM";

    public String generateToken(SysUserInfo sysUserInfo) {

        Algorithm algorithm = Algorithm.HMAC256(sysUserInfo.getUnionId());

        Date issuedAt = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(issuedAt);
        calendar.add(Calendar.DATE, 1);
        Date expiresAt = calendar.getTime();
        String token = JWT.create()
                .withHeader(JWT_HEADER)
                .withIssuer(ISSUER)
                .withSubject(SUBJECT)
                .withAudience(AUDIENCE)
                .withIssuedAt(issuedAt)
                .withExpiresAt(expiresAt)
                .withClaim("id", DigestUtils.md5Hex(sysUserInfo.getUnionId()))
                .withClaim("role", sysUserInfo.getUserIdentity())
                .sign(algorithm);
        return token;
    }

    public DecodedJWT verifierToken(SysUserInfo sysUserInfo, String token) {

        Algorithm algorithm = Algorithm.HMAC256(sysUserInfo.getUnionId());
        JWTVerifier jwtVerifier = JWT.require(algorithm)
                .withIssuer(ISSUER)
                .withSubject(SUBJECT)
                .build();
        return jwtVerifier.verify(token);
    }
}
