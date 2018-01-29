package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        List<Empresa> empresas = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int respuesta;
        do {
            System.out.print("MENU:\n1)Crear nueva empresa.\n2)Añadir empleado a empresa ya existente.\n3)Listado de empresa.\n4)Listado detallado de empresas y empleados.\n5)Salir\n Opcion:");
            respuesta = Integer.parseInt(br.readLine());
            switch (respuesta) {
                case 1:

                    System.out.print("Nombre de la empresa:");
                    String nombreEmpresa = br.readLine();
                    System.out.print("Año de fundación:");
                    String anyofundacion = br.readLine();
                    Empresa nombreEmpres = new Empresa(nombreEmpresa, anyofundacion);
                    empresas.add(nombreEmpres);
                    break;

                case 2:
                    System.out.println("Empresa a la que quieres añadir empleado: ");
                    String empresa = br.readLine();
                    int i = 0;
                    while (i < empresas.size() && !empresas.get(i).getNombre().equalsIgnoreCase(empresa)) {
                        i++;
                    }

                if (i < empresas.size()) {
                    System.out.println("NOMBRE: ");
                    String nombreEmpleado = br.readLine();
                    System.out.println("APELLIDOS: ");
                    String apellidos = br.readLine();
                    System.out.println("FECHA DE NACIMIENTO: ");
                    String fechadenacimiento = br.readLine();
                    System.out.println("FECHA DE CONTRATACION: ");
                    String fechadecontratacion = br.readLine();
                    Empleado nuevoempleado = new Empleado(nombreEmpleado, apellidos, fechadenacimiento, fechadecontratacion);

                    empresas.get(i).getEmpleados().add(nuevoempleado);
                } else
                    System.out.println("Error");


            break;

            case 3:
                for (int j = 0; j <empresas.size() ; j++) {

                    System.out.print(empresas.get(j).getNombre());
                    System.out.println();
                }

                break;


            case 4:
                for (int j = 0; j < empresas.size(); j++) {

                    System.out.print("Empresa: "+empresas.get(j).getNombre());
                    System.out.println();

                    for (int k = 0; k < empresas.get(j).getEmpleados().size() ; k++) {

                        System.out.print(empresas.get(j).getEmpleados().get(k).getNombre()+"\n"+empresas.get(j).getEmpleados().get(k).getApellidos());

                    }
                    System.out.println();
                }
                  break;


            case 5:
                System.out.println("Has decidido salir");


            default:
                System.out.println("Opción no válida intentelo de nuevo");

        }
    }while(respuesta !=5);
}}