package xyz.foolcat.utils;

import org.apache.commons.codec.Charsets;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * AES数据加解密工具类
 *
 * @author liyongjian
 * @version 1.0
 * @date 2019-07-2019/7/31 0:02
 */
public class AesEncryptUtils {

    /**
     * 算法名称
     */
    private static final String KEY_ALGORITHM = "AES";

    /**
     * 加解密算法/模式/填充方式
     */
    private static final String ALGORITHM = "AES/CBC/NoPadding";


    /**
     * 解密方法
     *
     * @param encryptedDataStr 要解密的字符串
     * @param keyBytesStr      解密密钥
     * @return encryptedText   解密后的字符串
     */
    public static byte[] decrypt(String encryptedDataStr, String keyBytesStr, String ivStr) {
        byte[] encryptedText = null;
        try {
            byte[] sessionKeyDecodeBase64 = Base64.decodeBase64(keyBytesStr);
            byte[] encryptedDataDecodeBase64 = Base64.decodeBase64(encryptedDataStr);
            byte[] ivDecodeBase64 = Base64.decodeBase64(ivStr);

            SecretKey secretKey = new SecretKeySpec(sessionKeyDecodeBase64, KEY_ALGORITHM);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(ivDecodeBase64);

            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
            encryptedText = cipher.doFinal(encryptedDataDecodeBase64);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return encryptedText;
    }

    public static void main(String[] args) {
        String en = "CiyLU1Aw2KjvrjMdj8YKliAjtP4gsMZMQmRzooG2xrDcvSnxIMXFufNstNGTyaGS9uT5geRa0W4oTOb1WT7fJlAC+oNPdbB+3hVbJSRgv+4lGOETKUQz6OYStslQ142dNCuabNPGBzlooOmB231qMM85d2/fV6ChevvXvQP8Hkue1poOFtnEtpyxVLW1zAo6/1Xx1COxFvrc2d7UL/lmHInNlxuacJXwu0fjpXfz/YqYzBIBzD6WUfTIF9GRHpOn/Hz7saL8xz+W//FRAUid1OksQaQx4CMs8LOddcQhULW4ucetDf96JcR3g0gfRK4PC7E/r7Z6xNrXd2UIeorGj5Ef7b1pJAYB6Y5anaHqZ9J6nKEBvB4DnNLIVWSgARns/8wR2SiRS7MNACwTyrGvt9ts8p12PKFdlqYTopNHR1Vf7XjfhQlVsAJdNiKdYmYVoKlaRv85IfVunYzO0IKXsyl7JCUjCpoG20f0a04COwfneQAGGwd5oa+T8yO5hzuyDb/XcxxmK01EpqOyuxINew==";
        String a = new String(AesEncryptUtils.decrypt(en,"tiihtNczf5v6AKRyjwEUhQ==","r7BXXKkLb8qrSNn05n0qiA=="));
        System.out.println(a);
    }

}
