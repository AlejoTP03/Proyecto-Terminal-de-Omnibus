/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
public class Conductor {
    private String omnibusMatricula;
    private int numConductor;
    private String nombre;
    private String apellido;
    private String direccion;
    private Omnibus omnibus;

    public Conductor(String omnibusMatricula, int numConductor, String nombre, String apellido, String direccion, Omnibus omnibus) {
        this.omnibusMatricula = omnibusMatricula;
        this.numConductor = numConductor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.omnibus = omnibus;
    }

    
    public String getOmnibusMatricula() {
        return omnibusMatricula;
    }

   
    public void setOmnibusMatricula(String omnibusMatricula) {
        this.omnibusMatricula = omnibusMatricula;
    }

    public int getNumConductor() {
        return numConductor;
    }

    public void setNumConductor(int numConductor) {
        this.numConductor = numConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Omnibus getOmnibus() {
        return omnibus;
    }

    public void setOmnibus(Omnibus omnibus) {
        this.omnibus = omnibus;
    }

    
    
    @Override
    public String toString() {
        return "Conductor{" + "omnibusMatricula=" + omnibusMatricula + ", numConductor=" + numConductor + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }
    

    
    
}
