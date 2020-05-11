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
public class Paciente {
    int no_carne;
    String nombres;
    String apellidos;
    String fecha_nac;
    String localidad;
    String genero;
    String dirreccion;
    
    public Paciente(){
        
    }

    public Paciente(int no_carne, String nombres, String apellidos, String fecha_nac, String localidad, String genero, String dirreccion) {
        this.no_carne = no_carne;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nac = fecha_nac;
        this.localidad = localidad;
        this.genero = genero;
        this.dirreccion = dirreccion;
    }

    public int getNo_carne() {
        return no_carne;
    }

    public void setNo_carne(int no_carne) {
        this.no_carne = no_carne;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }
    
    
}
