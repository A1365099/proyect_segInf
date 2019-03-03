import javax.crypto.*;
import javax.crypto.spec.*;
import javax.xml.bind.DatatypeConverter;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.*;

public class BlockCiphers {

    public static long getAESCTR(String input, String key){
        long startTime = System.nanoTime();
        byte[] k =  DatatypeConverter.parseHexBinary(key);
        String iv = "f0f1f2f3f4f5f6f7f8f9fafbfcfdfeff";
        byte[] ivBytes =  DatatypeConverter.parseHexBinary(iv);
        try{
        //  byte [] ivBytes = iv.getBytes();
            Key keya = new SecretKeySpec(k, "AES");     
            IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
            Cipher c1 = Cipher.getInstance("AES/CTR/NoPadding");    
            c1.init(Cipher.ENCRYPT_MODE, keya,ivSpec);

            byte[] msg = c1.doFinal(DatatypeConverter.parseHexBinary(input));
            BigInteger no = new BigInteger(1, msg); 
            String ciphertext = no.toString(16).toUpperCase();
          //  return ciphertext;


        }catch(Exception e){
            System.out.println("Erros: "+e);
           // return null;
        }
        long stopTime = System.nanoTime();

        return (stopTime - startTime);
    }

    public static long getAES256(String input, String key) {
        long startTime = System.nanoTime();
        SecureRandom random = new SecureRandom();
        byte[] k = DatatypeConverter.parseHexBinary(key);
        byte[] bytes = new byte[20];

        random.nextBytes(bytes);
        byte[] saltBytes = bytes;

        try {
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            PBEKeySpec spec = new PBEKeySpec(key.toCharArray(), saltBytes, 100, 256);
            SecretKey tmp = factory.generateSecret(spec);

            SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
            Cipher c = Cipher.getInstance("AES/ECB/PKCS5PADDING");

            c.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] msg = c.doFinal(DatatypeConverter.parseHexBinary(input));
            BigInteger no = new BigInteger(1, msg);
            String ciphertext = no.toString(16).toUpperCase();
        } catch (Exception e) {
            System.out.println("Errors: " + e);
        }

        long stopTime = System.nanoTime();

        return (stopTime - startTime);
    }

    public static long getAES(String input, String key){
        long startTime = System.nanoTime();
        byte[] k =  DatatypeConverter.parseHexBinary(key);
        try {
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
            Cipher c = Cipher.getInstance("AES/ECB/PKCS5PADDING");

            c.init(Cipher.ENCRYPT_MODE, skeySpec);

            byte[] msg = c.doFinal(DatatypeConverter.parseHexBinary(input));

            BigInteger no = new BigInteger(1, msg);

            String ciphertext = no.toString(16).toUpperCase();
        } catch(Exception e) {
            System.out.println("Erros: "+e);
        }

        long stopTime = System.nanoTime();

        return (stopTime - startTime);
    }

    public static long getDES(String input, String key){
        long startTime = System.nanoTime();

        byte[] k =  DatatypeConverter.parseHexBinary(key);

        try {
            DESKeySpec dks = new DESKeySpec(k);
            SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
            SecretKey sk = skf.generateSecret(dks);
            Cipher c = Cipher.getInstance("DES/ECB/NoPadding");
            c.init(Cipher.ENCRYPT_MODE, sk);

            byte[] msg = c.doFinal(DatatypeConverter.parseHexBinary(input));
            BigInteger no = new BigInteger(1, msg);
            String ciphertext = no.toString(16).toUpperCase();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        long stopTime = System.nanoTime();

        return (stopTime - startTime);
    }
}