package Semana2.Ejercicio1.Despues;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encriptador {

    public String encriptarContrasena(String contrasena) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(contrasena.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            return e.getMessage();
        }
    }
}
