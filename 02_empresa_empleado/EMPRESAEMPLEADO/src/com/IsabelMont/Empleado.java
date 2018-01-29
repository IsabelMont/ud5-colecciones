package com.IsabelMont;

public class Empleado {

    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String fechaContrato;

    public Empleado(String nombre, String apellidos, String fechaNacimiento, String fechaContrato) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContrato = fechaContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }
    private Empresa empresa;

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}
