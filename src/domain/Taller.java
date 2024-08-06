/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Taller {
    private int numTaller = 2038;
    private String nombre = "Mecanical Solution";
    private String direccion = "Carretera Jatibonico #103";
    private List<Omnibus> listaOmnibus = new LinkedList<>();

    
        
    public int getNumTaller() {
        return numTaller;
    }

    public void setNumTaller(int numTaller) {
        this.numTaller = numTaller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Omnibus> getListaOmnibus() {
        return listaOmnibus;
    }

    public void setListaOmnibus(List<Omnibus> listaOmnibus) {
        this.listaOmnibus = listaOmnibus;
    }

    
    
    
    @Override
    public String toString() {
        return "Taller{" + "numTaller=" + numTaller + ", nombre=" + nombre + ", direccion=" + direccion + ", listaOmnibus=" + listaOmnibus + '}';
    }
    
      
}
