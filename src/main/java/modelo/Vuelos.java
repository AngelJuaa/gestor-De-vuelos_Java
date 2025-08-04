/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Angel
 */
public class Vuelos {
     private String codigo;
    private String origen;
    private String destino;
    private String hora;
    private String fecha_llegada;
    private Date fecha_completa;
    private Integer numeroPasajeros;

    // Formato de fecha usado
    private static final SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy HH:mm");

    public Vuelos(String codigo1, String origen1, String destino1, String hora1, Date fecha_completa1, Integer numeroPasajeros1) {
    }
    public Vuelos(String codigo, String origen, String destino, String hora, String fecha_llegada, Date fecha_completa, Integer numeroPasajeros) throws ParseException{
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        String fecha = fecha_llegada + " " + hora;
        this.fecha_completa = format.parse(fecha_llegada);
        this.numeroPasajeros = numeroPasajeros;
    }

   


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public Date getFecha_completa() {
        return fecha_completa;
    }

    public void setFecha_completa(Date fecha_completa) {
        this.fecha_completa = fecha_completa;
    }

    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(Integer numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelos{" + "codigo=" + codigo + ", origen=" + origen + ", destino=" + destino + ", hora=" + hora + ", fecha_llegada=" + fecha_llegada + ", fecha_completa=" + fecha_completa + ", numeroPasajeros=" + numeroPasajeros + '}';
    }

    public void emptyAll(){
        this.codigo = "";
        this.destino = "";
        this.fecha_completa = null;
        this.fecha_llegada = "";
        this.hora = "";
        this.numeroPasajeros = null;
        this.origen = "";
    }


    
}