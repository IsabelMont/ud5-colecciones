package com.IsabelMont;

import java.util.ArrayList;
import java.util.Date;


public class Ticket {

    private String NdeTicket;
    private String NombreTienda;
    private String Date ;
    private String hora ;

    public Ticket(String ndeTicket, String nombreTienda, String date, String hora) {
        NdeTicket = ndeTicket;
        NombreTienda = nombreTienda;
        this.Date = date;
        this.hora = hora;
    }

    private ArrayList <LineaTiket> lista = new ArrayList<>();

    public ArrayList<LineaTiket> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "NdeTicket='" + NdeTicket + '\'' +
                ", NombreTienda='" + NombreTienda + '\'' +
                ", Date='" + Date + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
