/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anthony Mejía
 */
public class PlantaDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c=new Conexion();
    Connection con;
    
    public List listar(){
        List<Planta>lista=new ArrayList<>();
        String sql="select * from planta";
        try{
            con = c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Planta p=new Planta();
                p.setNo_planta(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setTotal_camas(rs.getInt(3));
                lista.add(p);
            }
            System.out.println("LLEGA!");
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
        return lista;
    }
    
    public int agregar(Planta p){
            int r=0;
            String sql = "insert into planta (no_planta, nombre, total_camas)values(?,?,?)";    
            try {
                con=c.conectar();
                ps=con.prepareStatement(sql);
                ps.setInt(1, p.getNo_planta());
                ps.setString(2, p.getNombre());
                ps.setInt(3, p.getTotal_camas());
                r=ps.executeUpdate();
                if(r==1){
                    r=1;
                }else {
                    r=0;
                }
            } catch (Exception e){
                
            }
            return r;
    }
    
    public Planta listarId(int id){
        String sql = "select * from planta where no_planta="+id;
        Planta p = new Planta();
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setNo_planta(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setTotal_camas(rs.getInt(3));
            }
        } catch (Exception e){
            System.out.println("ERROR: " + e);
        }
        return p;
    }
}


