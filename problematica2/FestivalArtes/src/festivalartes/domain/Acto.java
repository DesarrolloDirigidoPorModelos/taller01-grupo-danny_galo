/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package festivalartes.domain;

import java.util.Date;

/**
 *
 * @author dmunoz
 */
public class Acto {
    
    private String nombre;
    private String lugar;
    private Date fecha;
    private double costo;
    private Empresa empresa;
    
    public Acto(String nombre, String lugar, Date fecha, double costo, Empresa empresa){
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.costo = costo;
        this.empresa = empresa;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Acto -> {nombre: " + this.nombre + "; lugar: " + this.lugar + "; cost: " + this.costo + "; empresa: " + this.empresa.toString() + "}";
    }
    
    
    
    
    
    
}
