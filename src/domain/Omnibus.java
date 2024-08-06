/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;



/**
 *
 * @author PC
 */
public class Omnibus {
    private String matricula;
    private int numOmnibus;
    private String marca;
    private String modelo;
    private int capacidad;
    private String paisProcedencia;
    private int numTaller;
    private List<Pasajero> listaPasajeros;
    private List<Conductor> listaConductor;

    public Omnibus(String matricula, int numOmnibus, String marca, String modelo, int capacidad, String paisProcedencia, int numTaller, List<Pasajero> listaPasajeros, List<Conductor> listaConductor) {
        this.matricula = matricula;
        this.numOmnibus = numOmnibus;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.paisProcedencia = paisProcedencia;
        this.numTaller = numTaller;
        this.listaPasajeros = listaPasajeros;
        this.listaConductor = listaConductor;
    }

    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumOmnibus() {
        return numOmnibus;
    }

    public void setNumOmnibus(int numOmnibus) {
        this.numOmnibus = numOmnibus;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public int getNumTaller() {
        return numTaller;
    }

    public void setNumTaller(int numTaller) {
        this.numTaller = numTaller;
    }

    public List<Pasajero> getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(List<Pasajero> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    public List<Conductor> getListaConductor() {
        return listaConductor;
    }

    public void setListaConductor(List<Conductor> listaConductor) {
        this.listaConductor = listaConductor;
    }

    
    
    
    @Override
    public String toString() {
        return "Omnibus{" + "matricula=" + matricula + ", numOmnibus=" + numOmnibus + ", marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + ", paisProcedencia=" + paisProcedencia + ", numTaller=" + numTaller + '}';
    }
    
       
}
