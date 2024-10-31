package Semana11.Ejercicio1.Antes;

class SQLDatabase {

    public boolean checkUserExists(String username) {
        // Simulación de consulta a la base de datos
        if (username.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePassword(String password) {
        // Simulación de consulta a la base de datos
        if (password.equals("admin123")) {
            return true;
        } else {
            return false;
        }
    }
}
