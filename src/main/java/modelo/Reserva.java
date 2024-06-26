package modelo;

import java.sql.Time;
import java.util.Date;

public class Reserva {
	
	private int id;
	private Date fecha;
	private int hora;
	private int numPersonas;
	private String alergenos;
	private String observaciones;
	
	
	public Reserva() {
		
	}
	public Reserva(int id, Date fecha, int hora, int numPersonas, String alergenos, String observaciones) {
	
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.numPersonas = numPersonas;
		this.alergenos = alergenos;
		this.observaciones = observaciones;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getNumPersonas() {
		return numPersonas;
	}
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}
	public String getAlergenos() {
		return alergenos;
	}
	public void setAlergenos(String alergenos) {
		this.alergenos = alergenos;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", numPersonas=" + numPersonas
				+ ", alergenos=" + alergenos + ", observaciones=" + observaciones + "]";
	}
	
	
	
}
