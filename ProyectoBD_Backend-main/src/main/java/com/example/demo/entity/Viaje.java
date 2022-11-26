package com.example.demo.entity;
import javax.persistence.*;

@Entity
@Table(name = "reservacion")
public class Viaje {
    public int getIdReservacion() {
		return idReservacion;
	}

	public void setIdReservacion(int idReservacion) {
		this.idReservacion = idReservacion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

	public int getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(int idViaje) {
		this.idViaje = idViaje;
	}

	@Id
    @Column(name = "id_reservacion")
    private int idReservacion;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "id_boleto")
    private int idBoleto;

    @Column(name = "id_viaje")
    private int idViaje;

}
