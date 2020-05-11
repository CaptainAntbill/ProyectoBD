
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
public class PacienteDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c=new Conexion();
    Connection con;
    
    public List listar(){
        List<Paciente>lista=new ArrayList<>();
        String sql="select * from paciente";
        try{
            con = c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Paciente p=new Paciente();
                p.setNo_carne(rs.getInt(1));
                p.setNombres(rs.getString(2));
                p.setApellidos(rs.getString(3));
                p.setFecha_nac(rs.getString(4));
                p.setLocalidad(rs.getString(5));
                p.setGenero(rs.getString(6));
                p.setDirreccion(rs.getString(7));
                lista.add(p);
            }
        } catch (Exception e){
            
        }
        return lista;
    }
    
    public int agregar(Paciente p){
            int r=0;
            String sql = "insert into paciente (no_carne, nombres, apellidos, fecha_nac, localidad, genero, direccion)values(?,?,?,?,?,?,?)";    
            try {
                con=c.conectar();
                ps=con.prepareStatement(sql);
                ps.setInt(1, p.getNo_carne());
                ps.setString(2, p.getNombres());
                ps.setString(3, p.getApellidos());
                ps.setString(4, p.getFecha_nac());
                ps.setString(5, p.getLocalidad());
                ps.setString(6, p.getGenero());
                ps.setString(7, p.getDirreccion());
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
    
    public Paciente listarId(int id){
        String sql = "select * from paciente where no_carne="+id;
        Paciente p = new Paciente();
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setNo_carne(rs.getInt(1));
                p.setNombres(rs.getString(2));
                p.setApellidos(rs.getString(3));
                p.setFecha_nac(rs.getString(4));
                p.setLocalidad(rs.getString(5));
                p.setGenero(rs.getString(6));
                p.setDirreccion(rs.getString(7));
            }
        } catch (Exception e){
            System.out.println("ERROR: " + e);
        }
        return p;
    }
    public int actualizar(Paciente p){
        int r=0;
        String sql="update paciente set nombres=?, apellidos=?, fecha_nac=?, localidad=?, genero=?, direccion=? where no_carne=?";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getNombres());
                ps.setString(2, p.getApellidos());
                ps.setString(3, p.getFecha_nac());
                ps.setString(4, p.getLocalidad());
                ps.setString(5, p.getGenero());
                ps.setString(6, p.getDirreccion());
                ps.setInt(7, p.getNo_carne());
                ps.executeUpdate();//filas afectadas
                if(r==1){
                    r=1;
                }else {
                    r=0;
                }
                ps.close();
                con.close();
        } catch (Exception e){
              System.out.println("ERROR gggg: " + e);  
        }
        return r;

    }
}
