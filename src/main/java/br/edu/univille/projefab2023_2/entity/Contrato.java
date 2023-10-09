package br.edu.univille.projefab2023_2.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;

@Entity
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double valorContrato;
    private Date prazoContrato;
    private double valorOrcamento;

    @OneToMany
    
    private List<Servico> servico = new ArrayList<>();
    
    public Contrato(long id, double valorContrato, Date prazoContrato, double valorOrcamento) {
        this.id = id;
        this.valorContrato = valorContrato;
        this.prazoContrato = prazoContrato;
        this.valorOrcamento = valorOrcamento;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }
    public void setPrazoContrato(Date prazoContrato) {
        this.prazoContrato = prazoContrato;
    }
    public void setValorOrcamento(double valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }
    public long getId() {
        return id;
    }
    public double getValorContrato() {
        return valorContrato;
    }
    public Date getPrazoContrato() {
        return prazoContrato;
    }
    public double getValorOrcamento() {
        return valorOrcamento;
    }

    
}
