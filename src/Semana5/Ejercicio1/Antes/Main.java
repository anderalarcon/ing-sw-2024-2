package Semana5.Ejercicio1.Antes;

public class Main {

    public static void main(String[] args) {
        GeneradorDeReportes generador = new GeneradorDeReportes();

        // Genera diferentes tipos de reportes, según el parámetro
        generador.generarReporte("PDF");
        generador.generarReporte("Excel");
        generador.generarReporte("HTML");
    }
}
