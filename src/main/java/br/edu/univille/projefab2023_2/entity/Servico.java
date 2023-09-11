package br.edu.univille.projefab2023_2.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double custo;
    @Column(nullable = false)
    private Date prazo;
    private Date dataEntrega;

    @OneToMany
    private List<Funcionario> funcionarios = new ArrayList<>();
    @ManyToAny
    private List<Cliente> clientes = new ArrayList<>();

    
    public Servico(long id, double custo, Date prazo, Date dataEntrega) {
        this.id = id;
        this.custo = custo;
        this.prazo = prazo;
        this.dataEntrega = dataEntrega;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }
    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }
    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public long getId() {
        return id;
    }
    public double getCusto() {
        return custo;
    }
    public Date getPrazo() {
        return prazo;
    }
    public Date getDataEntrega() {
        return dataEntrega;
    }


}
