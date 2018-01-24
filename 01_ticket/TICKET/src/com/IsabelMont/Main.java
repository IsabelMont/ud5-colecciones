package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Numero de ticket: ");
        String numeroticket = br.readLine();
        System.out.print("Nombre de tienda:  ");
        String nombreTienda = br.readLine();
        System.out.print("Dia de ticket:  ");
        String fecha = br.readLine();
        System.out.print("Hora del ticket: ");
        String hora = br.readLine();


        Ticket uno = new Ticket(numeroticket,nombreTienda,fecha,hora);
        System.out.println(uno);
        int cantidad;
        do {

            System.out.print("Cantidad del producto: ");
            cantidad = Integer.parseInt(br.readLine());
            if (cantidad!=0){
            System.out.print("Nombre del producto: ");
            String producto = br.readLine();

            System.out.print("Precio del producto: ");
            Double precio = Double.parseDouble(br.readLine());

            uno.getLista().add(new LineaTiket(cantidad, producto, precio));}

        }while(cantidad!=0);

        double total = 0;
        for (int i = 0; i < uno.getLista().size(); i++) {

            total = (uno.getLista().get(i).resultado()) + total;
        }

        System.out.println("Total antes de iva "+total+"\nTotal + Iva: "+(total*1.21));
    }
}
