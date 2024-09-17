
package Semana5.Ejercicio1.Despues;

public class GeneradorDeReportes {
    
    public void generarReporte(String tipo) {
        if (tipo.equalsIgnoreCase("PDF")) {
            generarReportePDF();
        } else if (tipo.equalsIgnoreCase("Excel")) {
            generarReporteExcel();
        } else if (tipo.equalsIgnoreCase("HTML")) {
            generarReporteHTML();
        } else {
            throw new IllegalArgumentException("Tipo de reporte no soportado");
        }
    }

    // Genera un reporte en PDF
    private void generarReportePDF() {
        System.out.println("Generando reporte en formato PDF...");
        // Lógica específica para generar un reporte PDF
    }

    // Genera un reporte en Excel
    private void generarReporteExcel() {
        System.out.println("Generando reporte en formato Excel...");
        // Lógica específica para generar un reporte Excel
    }

    // Genera un reporte en HTML
    private void generarReporteHTML() {
        System.out.println("Generando reporte en formato HTML...");
        // Lógica específica para generar un reporte HTML
    }
}