/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package festivalartes.domain;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dmunoz
 */
public class Supervisor {
    
    private String identificacion;
    private String nombres;
    private String apellidos;
    private Set<Acto> actos;

    public Supervisor(String identificacaion, String nombres, String apellidos){
        this.identificacion = identificacaion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.actos = new HashSet<>();
    }

    /**
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Set<Acto> getActos() {
        return actos;
    }

    public void setActos(Set<Acto> actos) {
        this.actos = actos;
    }
    
    

    @Override
    public String toString() {
        return "Supervisor -> {" + this.identificacion + " - "  + this.apellidos + " " + this.nombres + "}";
    }
    
    
    
}
