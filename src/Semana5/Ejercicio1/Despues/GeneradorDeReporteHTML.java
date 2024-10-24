package Semana5.Ejercicio1.Despues;

public class GeneradorDeReporteHTML extends GeneradorDeReportes {

    @Override
    public Reporte crearReporte() {
        return new ReporteHTML();
    }

}
