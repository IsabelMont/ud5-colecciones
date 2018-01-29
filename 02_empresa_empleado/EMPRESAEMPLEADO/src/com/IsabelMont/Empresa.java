package com.IsabelMont;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String anyoFundacion;

    public Empresa(String nombre, String anyoFundacion) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    List<Empleado> empleados = new ArrayList<>();

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
