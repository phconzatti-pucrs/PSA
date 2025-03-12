package com.phconzatti.ex1.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    private long id;
    private String nome; 
    private int numDependentes, idade;
    private double totalCompra;

    public Usuario() {
    }

    public Usuario(long id, String nome, int idade, int numDependentes) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.numDependentes = numDependentes;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setDataNasc(int idade) {
        this.idade = idade;
    }

    public int getNumDependentes() {
        return this.numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

    public double getTotalCompra (){
        return totalCompra;
    }

    public void setTotalCompra (double totalCompra){
        this.totalCompra = totalCompra;
    }

}
