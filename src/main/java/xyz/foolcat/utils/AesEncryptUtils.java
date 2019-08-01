package xyz.foolcat.utils;

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

    /**
     * PKCS7Padding 数据填充
     *
     * @param data  需要加密的字符串
     * @return      进行PKCS7Padding填充后的明文字符串
     */
    public static String pkcs7padding(String data) {
        int blockLength = 16;
        int padding = blockLength - (data.length() % blockLength);
        String paddingText = "";
        for (int i = 0; i < padding; i++) {
            paddingText += (char)padding;
        }
        return data+paddingText;
    }

}
