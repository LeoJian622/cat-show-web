package xyz.foolcat.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-08-2019/8/4 22:58
 */
@Slf4j
public class WeChatSinatureUtils {

    /**
     * sha1 校验
     * @param rawData 签名字符串
     * @param sign 签名
     * @param salt 盐
     * @return 校验结果
     */
    public static boolean checkSignatureSha1(String rawData, String sign, String salt) {
        String sha1Data = null;
        try {
            String checkString = rawData + salt;
            sha1Data = new String(DigestUtils.sha1(checkString));
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return sha1Data != null && sha1Data.equals(sign);
    }

    /**
     * md5 校验
     * @param rawData 签名字符串
     * @param sign 签名
     * @param salt 盐
     * @return 校验结果
     */
    public static boolean checkSignatureMd5(String rawData, String sign ,String salt) {
        String md5Data = null;
        try {
            String checkString = rawData + salt;
            md5Data = DigestUtils.md5Hex(checkString);
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return md5Data != null && md5Data.equals(sign);
    }
}
