package com.phconzatti.ex1.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    private long id;
    private String nome, dataNasc;
    private int numDependentes;


    public Usuario() {
    }

    public Usuario(long id, String nome, String dataNasc, int numDependentes) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
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

    public String getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getNumDependentes() {
        return this.numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

}
