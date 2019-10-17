/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher;

/**
 *
 * @author ncm
 */
public class CaesarCipher {

    public static String encrypt(String plain, int key) {
        char Alphabet;
        String encryptedText = "";
        for (int i = 0; i < plain.length(); i++) {
            Alphabet = plain.charAt(i);
            if (Character.isLetter(Alphabet)) {
                Alphabet = (char) (Alphabet + key);
                if (Character.isLowerCase(plain.charAt(i)) && Alphabet > 'z' || Character.isUpperCase(plain.charAt(i)) && Alphabet > 'Z') {
                    Alphabet = (char) (plain.charAt(i) - (26 - key));
                }
            }
            encryptedText += Alphabet;
        }
        return encryptedText;
    }

    public static String decrypt(String cipher, int key) {
        char Alphabet;
        String decryptedText = "";
        for (int i = 0; i < cipher.length(); i++) {
            Alphabet = cipher.charAt(i);
            if (Character.isLetter(Alphabet)) {
                Alphabet = (char) (Alphabet - key);
                if (Character.isLowerCase(cipher.charAt(i)) && Alphabet < 'a' || Character.isUpperCase(cipher.charAt(i)) && Alphabet < 'A') {
                    Alphabet = (char) (cipher.charAt(i) + (26 - key));
                }
            }
            decryptedText += Alphabet;
        }
        return decryptedText;
    }
}
