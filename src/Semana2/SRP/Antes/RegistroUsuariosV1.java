package Semana2.SRP.Antes;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class RegistroUsuariosV1 {

    private String nombre;
    private String contraseña;

    public RegistroUsuariosV1(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public void registrarUsuario() {
        // Lógica para guardar el usuario en la base de datos
        encriptarContraseña();
        System.out.println("Usuario registrado: " + nombre);
    }

    public void encriptarContraseña() {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(contraseña.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            this.contraseña = hexString.toString();
            System.out.println("Contraseña encriptada!: " + this.contraseña);
        } catch (NoSuchAlgorithmException e) {
            e.getMessage();
        }
    }

}
