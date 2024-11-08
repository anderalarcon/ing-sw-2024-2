package Semana12.Ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Empleado {

    private String nombre;
    private String rol;
    private double salarioBase;
    private double bonificacion;

    private static final Map<String, Double> BONIFICACIONES_POR_ROL = new HashMap<>();

    static {
        BONIFICACIONES_POR_ROL.put("Gerente", 0.20);    // 20% de bonificación para Gerentes
        BONIFICACIONES_POR_ROL.put("Administrador", 0.10); // 10% de bonificación para Administradores
        BONIFICACIONES_POR_ROL.put("Empleado", 0.05);      // 5% de bonificación para Empleados
    }

    public Empleado(String nombre, String rol, double salarioBase) {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario base debe ser mayor a cero.");
        }

        if (!BONIFICACIONES_POR_ROL.containsKey(rol)) {
            throw new IllegalArgumentException("Rol no válido.");
        }

        this.nombre = nombre;
        this.rol = rol;
        this.salarioBase = salarioBase;
        this.bonificacion = BONIFICACIONES_POR_ROL.get(rol);
    }

    public double calcularSalarioConBonificacion() {
        return salarioBase + (salarioBase * bonificacion);
    }

    public boolean tienePermiso(String permiso) {
        if ("Administrador".equals(rol) && permiso.equals("ACCESO_TOTAL")) {
            return true;
        } else if ("Gerente".equals(rol) && (permiso.equals("ACCESO_LIMITADO") || permiso.equals("ACCESO_REPORTE"))) {
            return true;
        } else {
            return "Empleado".equals(rol) && permiso.equals("ACCESO_LIMITADO");
        }
    }

    public String getRol() {
        return rol;
    }
}
