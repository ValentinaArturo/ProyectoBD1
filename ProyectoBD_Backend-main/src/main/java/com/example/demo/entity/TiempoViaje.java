package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tiempo_viaje")

public class TiempoViaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_tiempo_viaje")
    private int idTiempoViaje;

    @Column(name = "tiempo")
    private String tiempo;

    @OneToMany(mappedBy = "idTiempo")
    private List<Ruta>rutaList;

    public int getIdTiempoViaje() {
        return idTiempoViaje;
    }

    public void setIdTiempoViaje(int idTiempoViaje) {
        this.idTiempoViaje = idTiempoViaje;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public List<Ruta> getRutaList() {
        return rutaList;
    }

    public void setRutaList(List<Ruta> rutaList) {
        this.rutaList = rutaList;
    }
}
