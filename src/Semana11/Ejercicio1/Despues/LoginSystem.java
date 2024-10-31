package Semana11.Ejercicio1.Despues;

public class LoginSystem {

    private Database database;
    private Validator validator;

    // Constructor que permite inyectar ambas dependencias
    public LoginSystem(Database database, Validator validator) {
        this.database = database;
        this.validator = validator;
    }

    public void login(String username, String password) {
        if (!validator.areCredentialsValid(username, password)) {
            return;
        }

        if (!database.checkUserExists(username)) {
            System.out.println("No se encontro usuario");
            return;
        }

        if (database.comparePassword(username, password)) {
            System.out.println("Contraseña valida");
            System.out.println("Usuario logueado");
        } else {
            System.out.println("Contraseña invalida");
        }
    }
}
