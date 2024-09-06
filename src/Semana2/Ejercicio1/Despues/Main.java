package Semana2.Ejercicio1.Despues;

public class Main {

    public static void main(String[] args) {
        Encriptador e1 = new Encriptador();
        
        RegistroUsuariosV2 r2 = new RegistroUsuariosV2("ander", "123", e1);
        r2.registrarUsuario();
    }
}
