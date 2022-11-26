package com.example.demo.entity;
import javax.persistence.*;

@Entity
@Table(name = "encomienda")
public class Encomienda {
    @Id
    @Column(name = "id_encomienda")
    private int idEncomienda;

    @Column(name = "fragil")
    private String fragil;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "peso")
    private int peso;

    @Column(name = "id_tarifa_encomienda")
    private int idTarifaEncomienda;

    @Column(name = "id_tipo_encomienda")
    private int idTipoEncomienda;

    @Column(name = "id_ruta")
    private int idRuta;

    @Column(name = "id_reservacion_encomienda")
    private int idReservacionEncomienda;

    @Column(name = "id_remitente")
    private int idRemitente;

    @Column(name = "id_persona")
    private int idPersona;

    public int getIdEncomienda() {
        return idEncomienda;
    }

    public void setIdEncomienda(int idEncomienda) {
        this.idEncomienda = idEncomienda;
    }

    public String getFragil() {
        return fragil;
    }

    public void setFragil(String fragil) {
        this.fragil = fragil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdTarifaEncomienda() {
        return idTarifaEncomienda;
    }

    public void setIdTarifaEncomienda(int idTarifaEncomienda) {
        this.idTarifaEncomienda = idTarifaEncomienda;
    }

    public int getIdTipoEncomienda() {
        return idTipoEncomienda;
    }

    public void setIdTipoEncomienda(int idTipoEncomienda) {
        this.idTipoEncomienda = idTipoEncomienda;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getIdReservacionEncomienda() {
        return idReservacionEncomienda;
    }

    public void setIdReservacionEncomienda(int idReservacionEncomienda) {
        this.idReservacionEncomienda = idReservacionEncomienda;
    }

    public int getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(int idRemitente) {
        this.idRemitente = idRemitente;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
}
