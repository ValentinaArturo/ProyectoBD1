package com.example.demo.entity;
import javax.persistence.*;

@Entity
@Table(name = "Bus")
public class Bus {
    @Id
    @Column(name = "id_bus")
    private int idBus;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "pasajeros")
    private int pasajeros;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "id_tipo_placa")
    private int idTipoPlaca;

    @Column(name = "id_marca")
    private int idMarca;

    @Column(name = "id_tipo_color")
    private int idTipoColor;

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdTipoPlaca() {
        return idTipoPlaca;
    }

    public void setIdTipoPlaca(int idTipoPlaca) {
        this.idTipoPlaca = idTipoPlaca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdTipoColor() {
        return idTipoColor;
    }

    public void setIdTipoColor(int idTipoColor) {
        this.idTipoColor = idTipoColor;
    }
}
