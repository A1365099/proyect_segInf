import javax.crypto.*;
import javax.crypto.spec.*;
import javax.xml.bind.DatatypeConverter;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Security;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;

public class AsyncAlgorithms {

    public static long getRSA_OAEP(String input, String key) {
        long startTime = System.nanoTime();

        byte[] k =  DatatypeConverter.parseHexBinary(key);

        try {
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "RSA");
            Cipher c = Cipher.getInstance("RSA/None/OAEPWithSHA1AndMGF1Padding");
            c.init(Cipher.ENCRYPT_MODE, skeySpec);
            byte[] msg = c.doFinal(DatatypeConverter.parseHexBinary(input));
            BigInteger no = new BigInteger(1, msg);
            String ciphertext = no.toString(16).toUpperCase();
        } catch(Exception e){
          //  System.out.println(e.getMessage());
        }

        long stopTime = System.nanoTime();

        return (stopTime - startTime);
    }

    public static long getRSA_PSS(String input, String key) {
        long startTime = System.nanoTime();

        byte[] k =  DatatypeConverter.parseHexBinary(key);

        try {
            Signature signatureSha256 = Signature.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
            signatureSha256.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));

            X509EncodedKeySpec pubSpec = new X509EncodedKeySpec(k);
            KeyFactory keyFactory = KeyFactory.getInstance("SHA256withRSA/PSS");

            PrivateKey priv = keyFactory.generatePrivate(pubSpec);
            signatureSha256.initSign(priv);
            signatureSha256.update(input.getBytes());

            byte[] sign = signatureSha256.sign();
        } catch (Exception e) {
          //  System.out.println(e.getMessage());
        }

        long stopTime = System.nanoTime();

        return (stopTime - startTime);
    }
}