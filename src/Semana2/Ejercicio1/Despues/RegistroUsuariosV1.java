package Semana2.Ejercicio1.Despues;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class RegistroUsuariosV1 {

    private String nombre;
    private String contrasena;

    public RegistroUsuariosV1(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public void registrarUsuario() {
        // Lógica para guardar el usuario en la base de datos
        System.out.println("Registrando usuario...");
        System.out.println("Encriptando contraseña...");
        System.out.println("Usuario registrado con nombre:" + nombre + " y contraseña: " + encriptarContrasena());
    }

    public String encriptarContrasena() {
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
