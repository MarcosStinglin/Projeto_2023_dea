package br.edu.univille.projefab2023_2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private double valorOrcamento;

  public Cliente() {
    }
    public Cliente(long id, String nome, double valorOrcamento) {
        this.id = id;
        this.nome = nome;
        this.valorOrcamento = valorOrcamento;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public void setValorOrcamento(double valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }
    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getValorOrcamento() {
        return valorOrcamento;
    }
}
