package com.example.demo.entity;
import javax.persistence.*;

@Entity
@Table(name = "boleto")
public class Boleto {
    @Id
    @Column(name = "id_boleto")
    private int idBoleto;

    @Column(name = "numero_boleto")
    private Integer numeroBoleto;

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public Integer getNumero_Boleto() {
        return numeroBoleto;
    }

    public void setNumero_Boleto(Integer numero_Boleto) {
        this.numeroBoleto = numero_Boleto;
    }
}
