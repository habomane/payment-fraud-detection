package org.fraud.util;



import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Security {

    private static final String INIT_VECTOR = "RandomInitVector";
    private final static IvParameterSpec iv;

    static {
        try {
            iv = new IvParameterSpec(INIT_VECTOR.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public Security() {}

    public static String hashData(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(data.getBytes());
        StringBuilder hexString = new StringBuilder();

        for (byte b : hash) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }


    public static String decryptDataAES(String data, String secretKey) throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException, InvalidAlgorithmParameterException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        SecretKeySpec skeySpec = new SecretKeySpec(secretKey.getBytes("UTF-8"), "AES");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
        byte[] plainText = cipher.doFinal(Base64.getDecoder()
                .decode(data));

        return new String(plainText);
    }

    public static String encryptDataAES(String data, String secretKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec skeySpec = new SecretKeySpec(secretKey.getBytes("UTF-8"), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
        byte[] cipherText = cipher.doFinal(data.getBytes());
        return Base64.getEncoder()
                .encodeToString(cipherText);
    }
}
