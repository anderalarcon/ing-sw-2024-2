package Semana5.Ejercicio1.Despues;

public class GeneradorDeReportePDF extends GeneradorDeReportes {

    @Override
    public Reporte crearReporte() {
        return new ReportePDF();
    }

}
