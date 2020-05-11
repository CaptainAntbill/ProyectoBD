/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Anthony Mejía
 */
public class Planta {
    int no_planta;
    String nombre;
    int total_camas;

    public Planta() {
    }

    public Planta(int no_planta, String nombre, int total_camas) {
        this.no_planta = no_planta;
        this.nombre = nombre;
        this.total_camas = total_camas;
    }

    public int getNo_planta() {
        return no_planta;
    }

    public void setNo_planta(int no_planta) {
        this.no_planta = no_planta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotal_camas() {
        return total_camas;
    }

    public void setTotal_camas(int total_camas) {
        this.total_camas = total_camas;
    }
    
    
    
}
