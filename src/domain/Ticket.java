/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;
import java.sql.Time;

/**
 *
 * @author PC
 */
public class Ticket {
    private int pasajeroCI;
    private String omnibusMatricula;
    private String destino;
    private Date fechaSalida;
    private Time hora_Salida;

    
    
    public Ticket(int pasajeroCI, String omnibusMatricula, String destino, Date fechaSalida, Time hora_Salida) {
        this.pasajeroCI = pasajeroCI;
        this.omnibusMatricula = omnibusMatricula;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.hora_Salida = hora_Salida;
    }

    
    
    public int getPasajeroCI() {
        return pasajeroCI;
    }

    public void setPasajeroCI(int pasajeroCI) {
        this.pasajeroCI = pasajeroCI;
    }

    public String getOmnibusMatricula() {
        return omnibusMatricula;
    }

    public void setOmnibusMatricula(String omnibusMatricula) {
        this.omnibusMatricula = omnibusMatricula;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Time getHora_Salida() {
        return hora_Salida;
    }

    public void setHora_Salida(Time hora_Salida) {
        this.hora_Salida = hora_Salida;
    }

    
    
    @Override
    public String toString() {
        return "Ticket{" + "pasajeroCI=" + pasajeroCI + ", omnibusMatricula=" + omnibusMatricula + ", destino=" + destino + ", fechaSalida=" + fechaSalida + ", hora_Salida=" + hora_Salida + '}';
    }
    
    
}
