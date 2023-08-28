package br.edu.univille.projefab2023_2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long idServico;
    private String cargo;
    private double valorHora;
    
    public Funcionario(long id, long idServico, String cargo, double valorHora) {
        this.id = id;
        this.idServico = idServico;
        this.cargo = cargo;
        this.valorHora = valorHora;
    }

    public long getId() {
        return id;
    }

    public long getIdServico() {
        return idServico;
    }

    public String getCargo() {
        return cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setIdServico(long idServico) {
        this.idServico = idServico;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    

}
