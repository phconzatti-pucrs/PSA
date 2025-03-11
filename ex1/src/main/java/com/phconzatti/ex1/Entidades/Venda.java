package com.phconzatti.ex1.Entidades;

import java.util.ArrayList;

public class Venda {
    private Usuario usuario;
    private ArrayList<Produto> listaProduto;


    public Venda(Usuario usuario, ArrayList<Produto> listaProduto) {
        this.usuario = usuario;
        listaProduto = new ArrayList<Produto>();
    }
    
}
