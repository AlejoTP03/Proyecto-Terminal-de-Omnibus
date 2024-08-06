/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

/**
 *
 * @author PC
 */
public class Pasajero implements Serializable {
    @Id
    private int ci;
    @Basic
    private String nombre;
    private String apellido;
    private String calle;
    private String municipio;
    private String provincia;

    public Pasajero(int ci, String nombre, String apellido, String calle, String municipio, String provincia) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.municipio = municipio;
        this.provincia = provincia;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", calle=" + calle + ", municipio=" + municipio + ", provincia=" + provincia + '}';
    }
    
    
           
    
}
