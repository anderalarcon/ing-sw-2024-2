
package Semana11.Ejercicio1.Despues;

public class Main {

    public static void main(String[] args) {
        Database database = new SQLDatabase();
        Validator validator = new CredentialValidator();
        LoginSystem loginSystem = new LoginSystem(database, validator);

        loginSystem.login("admin", "admin123");
    }
}
