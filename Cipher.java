import java.util.Random;

/**
 * Encrypts data to be stored in a text file.
 * 
 * @author Maas Lalani
 * @version 1.0 2016-11-15
 */
public class Cipher
{
    /* Random key for encryption and decryption */
    private static final int KEY = 947;

    public static String encrypt(String data)
    {
        String encrypted = "";

        for (int i = 0; i < data.length(); i++)
        {
            encrypted += (char) ((int) data.charAt(i) + KEY);
        } // end of for (int i = 0; i < data.length; i++)

        return encrypted;
    } // end of method encrypt(String data)

    public static String decrypt(String message)
    {
        String decrypted = "";

        for (int i = 0; i < message.length(); i++)
        {
            decrypted += (char) ((int) message.charAt(i) - KEY);
        } // end of for (int i = 0; i < data.length; i++)

        return decrypted;
    } // end of method encrypt(String data)
} // end of class Encryption