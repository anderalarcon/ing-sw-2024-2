package Semana11.Ejercicio1.Despues;

import java.util.HashMap;
import java.util.Map;

public class SQLDatabase implements Database {

    // Simulación de una base de datos de usuarios
    private Map<String, String> userDatabase;

    public SQLDatabase() {
        // Inicializando una base de datos simulada con un usuario de ejemplo
        userDatabase = new HashMap<>();
        userDatabase.put("admin", "admin123");
    }

    @Override
    public boolean checkUserExists(String username) {
        return userDatabase.containsKey(username);
    }

    @Override
    public boolean comparePassword(String username, String password) {
        return userDatabase.get(username).equals(password);
    }
}
