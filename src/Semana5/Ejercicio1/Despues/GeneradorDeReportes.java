package Semana5.Ejercicio1.Despues;

public abstract class GeneradorDeReportes {

    public abstract Reporte crearReporte();

    public void generarReporte() {
        Reporte reporte = crearReporte();
        reporte.generar();
    }
}
