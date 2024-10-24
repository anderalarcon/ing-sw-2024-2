package Semana5.Ejercicio1.Despues;

public class GeneradorDeReporteExcel extends GeneradorDeReportes {

    @Override
    public Reporte crearReporte() {
        return new ReporteExcel();
    }

}
