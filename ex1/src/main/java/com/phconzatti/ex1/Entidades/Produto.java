package com.phconzatti.ex1.Entidades;

public class Produto {
    private long id;
    private String descricao;
    private int quantidade;
    private double preco;
    private String tipo;

    public Produto (){
    }

    public Produto(long id, String descricao, int quantidade, double preco, String tipo) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.tipo = tipo;
    }

    
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
