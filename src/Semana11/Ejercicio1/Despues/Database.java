package Semana11.Ejercicio1.Despues;

public interface Database {

    boolean checkUserExists(String username);

    boolean comparePassword(String username, String password);
}
