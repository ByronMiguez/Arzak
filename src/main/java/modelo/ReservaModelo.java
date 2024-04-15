package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.*;

public class ReservaModelo extends Conector{

	public ArrayList<Reserva> getTodos() {
        ArrayList<Reserva> reservas = new ArrayList<>();

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Reserva");
            while (rs.next()) {
                Reserva reserva = new Reserva();
                
                reserva.setId(rs.getInt("Id"));
                reserva.setFecha(rs.getDate("fecha"));
                reserva.setHora(rs.getInt("Hora"));
                reserva.setNumPersonas(rs.getInt("Nº Personas"));
                reserva.setAlergenos(rs.getString("Alergenos"));
                reserva.setObservaciones(rs.getString("Observaciones"));
                
                reservas.add(reserva);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return reservas;
    }
 
 public Reserva get(int id) {
     try {
         PreparedStatement pst = this.conexion.prepareStatement("SELECT * FROM reserva WHERE id=?");
         pst.setInt(1, id);
         ResultSet rs = pst.executeQuery();

         if (rs.next()) {
             Reserva reserva = new Reserva();

        	 reserva.setId(rs.getInt("Id"));
             reserva.setFecha(rs.getDate("fecha"));
             reserva.setHora(rs.getInt("Hora"));
             reserva.setNumPersonas(rs.getInt("Nº Personas"));
             reserva.setAlergenos(rs.getString("Alergenos"));
             reserva.setObservaciones(rs.getString("Observaciones"));
             

             return reserva;
         }
     } catch (SQLException e) {
         e.printStackTrace();
         return null;
     }
     return null;
 }
 
 public boolean delete(int id) {
     try {
         PreparedStatement pst = this.conexion.prepareStatement("DELETE FROM reserva WHERE id=?");
         pst.setInt(1, id);
         pst.execute();
         return true;
     } catch (SQLException e) {
         e.printStackTrace();
         return false;
     }
 }
 
// public int update(Reserva reserva) {
//     try {
//         PreparedStatement pst = this.conexion.prepareStatement("UPDATE reserva SET titulo = ?, descripcion = ? WHERE id = ?");
//         pst.setString(1, reserva.getTitulo());
//         pst.setString(2, tarea.getDescripcion());
//         pst.setInt(3, tarea.getId());
//
//         return pst.executeUpdate();
//     } catch (SQLException e) {
//         e.printStackTrace();
//         return 0;
//     }
// }
// 
// public void insert(Tarea tarea) {
//	    try {
//	        PreparedStatement pst = this.conexion.prepareStatement("INSERT INTO tareas (titulo, descripcion) VALUES (?, ?)");
//	        pst.setString(1, tarea.getTitulo());
//	        pst.setString(2, tarea.getDescripcion());
//	        pst.execute();
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    }
//	}
}
