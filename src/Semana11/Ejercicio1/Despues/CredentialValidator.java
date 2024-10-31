package Semana11.Ejercicio1.Despues;

public class CredentialValidator implements Validator {

    @Override
    public boolean areCredentialsValid(String username, String password) {
        if (username == null || password == null) {
            System.out.println("Credenciales invalidas");
            return false;
        }

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Inputs vacíos.");
            return false;
        }

        if (username.length() < 5 || password.length() < 8) {
            System.out.println("Inputs incorrectos.");
            return false;
        }

        return true;
    }
}
