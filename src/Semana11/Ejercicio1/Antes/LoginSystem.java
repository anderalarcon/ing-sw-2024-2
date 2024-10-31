package Semana11.Ejercicio1.Antes;

public class LoginSystem {

    private SQLDatabase database;

    public LoginSystem() {
        this.database = new SQLDatabase();
    }

    public void login(String username, String password) {
        if (username == null || password == null) {
            System.out.println("Credenciales invalidas");
        }

        if (username.length() < 5 || password.length() < 8) {
            System.out.println("Inputs incorrectos");
        }

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Inputs vacios");
        }

        if (database.checkUserExists(username)) {
            System.out.println("Usuario existe");
            if (database.comparePassword(password)) {
                System.out.println("Contraseña valida");
                System.out.println("Usuario logueado");
            }
        } else {
            System.out.println("No se encontro usuario");
        }
    }

    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();

        // Ejemplos de login
        loginSystem.login("admin", "admin123");
    }
}
