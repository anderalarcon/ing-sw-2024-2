package Semana5.Ejercicio1.Despues;

public class Main {

    public static void main(String[] args) {
        GeneradorDeReportes generadorPDF = new GeneradorDeReportePDF();
        generadorPDF.generarReporte();

        GeneradorDeReportes generadorExcel = new GeneradorDeReporteExcel();
        generadorExcel.generarReporte();

        GeneradorDeReportes generadorHTML = new GeneradorDeReporteHTML();
        generadorHTML.generarReporte();
    }
}
