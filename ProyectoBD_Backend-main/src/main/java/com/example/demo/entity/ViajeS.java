package com.example.demo.entity;
import javax.persistence.*;

@Entity
@Table(name = "viajes")
public class ViajeS {
   
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
