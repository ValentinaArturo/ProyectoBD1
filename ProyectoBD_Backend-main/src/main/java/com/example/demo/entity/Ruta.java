package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Ruta")
public class Ruta {
    @Id
    @Column(name = "id_ruta")
    private int idRuta;

    @Column(name = "tiempo")
    private String tiempo;

    @Column(name = "hora_salida")
    private String horaSalida;

    @Column(name = "hora_llegada")
    private String horaLlegada;

    @Column(name = "id_ruta_origen")
    private int idRutaOrigen;

    @Column(name = "id_ruta_destino")
    private int idRutaDestino;

    @Column(name = "id_tiempo")
    private int idTiempo;

    @OneToMany(mappedBy = "idRuta")
    private List<Encomienda>encomiendaList;

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getIdRutaOrigen() {
        return idRutaOrigen;
    }

    public void setIdRutaOrigen(int idRutaOrigen) {
        this.idRutaOrigen = idRutaOrigen;
    }

    public int getIdRutaDestino() {
        return idRutaDestino;
    }

    public void setIdRutaDestino(int idRutaDestino) {
        this.idRutaDestino = idRutaDestino;
    }

    public int getIdTiempo() {
        return idTiempo;
    }

    public void setIdTiempo(int idTiempo) {
        this.idTiempo = idTiempo;
    }

    public List<Encomienda> getEncomiendaList() {
        return encomiendaList;
    }

    public void setEncomiendaList(List<Encomienda> encomiendaList) {
        this.encomiendaList = encomiendaList;
    }
}
