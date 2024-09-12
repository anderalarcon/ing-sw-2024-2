package Semana4.Ejercicio3.Despues;

import java.util.HashMap;
import java.util.Map;

public class Controlador {

    private Map<String, Comando> comandos = new HashMap<>();

    public void asignarComando(String boton, Comando comando) {
        comandos.put(boton, comando);
    }

    public void presionarBoton(String boton) {
        if (comandos.containsKey(boton)) {
            comandos.get(boton).ejecutar();
        } else {
            System.out.println("Boton no asignado");
        }
    }

}
