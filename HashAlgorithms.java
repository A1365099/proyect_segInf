import java.math.BigInteger;
import java.security.*;

public class HashAlgorithms {

    public static long getSHA1(String input) {
        long startTime = System.nanoTime();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            StringBuilder hashtext = new StringBuilder(no.toString(16));

            while (hashtext.length() < 32) {
                hashtext.insert(0, "0");
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        long stopTime = System.nanoTime();

        return (stopTime - startTime);
    }

    public static long getSHA2(String input) {
        long startTime = System.nanoTime();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            StringBuilder hashtext = new StringBuilder(no.toString(16));

            while (hashtext.length() < 32) {
                hashtext.insert(0, "0");
            }

        } catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown  for incorrect algorithm: " + e);
        }

        long stopTime = System.nanoTime();

        return (stopTime - startTime);
    }

    public static long getMd5(String input) {
        long startTime = System.nanoTime();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);

            StringBuilder hashtext = new StringBuilder(no.toString(16));

            while (hashtext.length() < 32) {
                hashtext.insert(0, "0");
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        long stopTime = System.nanoTime();

        return (stopTime - startTime);
    }
}