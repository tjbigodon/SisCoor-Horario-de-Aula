/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilitarios;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author IFGoiano-Admin
 */
public class Criptografia {
    private static MessageDigest md = null;
    
    static {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
    }
    
    private static char[] hexCodes(byte[] text) {
        char[] saidaHex = new char[text.length * 2];
        String hexString;
 
        for (int i = 0; i < text.length; i++) {
            hexString = "00" + Integer.toHexString(text[i]);
            hexString.toUpperCase().getChars(hexString.length() - 2,
                                	hexString.length(), saidaHex, i * 2);
        }
        return saidaHex;
    }
    
    public static String criptografar(String senha) {
        if (md != null) {
            return new String(hexCodes(md.digest(senha.getBytes())));
        }
        return null;
    }
}
