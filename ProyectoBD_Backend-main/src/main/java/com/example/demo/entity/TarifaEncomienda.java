package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tarifa_encomienda")
public class TarifaEncomienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_tarifa_encomienda")
    private int idTarifaEncomienda;

    @Column(name = "tarifa")
    private int tarifa;

    @Column(name = "peso")
    private String peso;

    @Column(name = "metro_cubico")
    private String metroCubico;

    @OneToMany(mappedBy = "idTarifaEncomienda")
    private List<Encomienda>encomiendaList;

    public int getIdTarifaEncomienda() {
        return idTarifaEncomienda;
    }

    public void setIdTarifaEncomienda(int idTarifaEncomienda) {
        this.idTarifaEncomienda = idTarifaEncomienda;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getMetroCubico() {
        return metroCubico;
    }

    public void setMetroCubico(String metroCubico) {
        this.metroCubico = metroCubico;
    }

    public List<Encomienda> getEncomiendaList() {
        return encomiendaList;
    }

    public void setEncomiendaList(List<Encomienda> encomiendaList) {
        this.encomiendaList = encomiendaList;
    }
}
