package com.phconzatti.ex1.Servico;

import com.phconzatti.ex1.Entidades.Produto;
import com.phconzatti.ex1.Entidades.Usuario;

public class VendaValor {
    
    public double calculaImposto (Produto produto){
        if (produto.getTipo().equalsIgnoreCase("alimenticio")){
            produto.setPreco(produto.getPreco() + (produto.getPreco()*0.05));
            System.out.println("Preço do produto: R$ "+produto.getPreco());
            return produto.getPreco(); 
        } else if (produto.getTipo().equalsIgnoreCase("automotivo")){
            produto.setPreco(produto.getPreco() + (produto.getPreco()*0.3));
            System.out.println("Preço do produto: R$ "+produto.getPreco());
            return produto.getPreco(); 
        } else if (produto.getTipo().equalsIgnoreCase("alcoolico")){
            produto.setPreco(produto.getPreco() * 2);
            System.out.println("Preço do produto: R$ "+produto.getPreco());
            return produto.getPreco(); 
        } else {
            produto.setPreco(produto.getPreco() + (produto.getPreco()*0.17));
            System.out.println("Preço do produto: R$ "+produto.getPreco());
            return produto.getPreco(); 
        }
    }

    public double valorCompra (Usuario usuario, Produto produto){
        if (usuario.getIdade() > 60 && produto.getTipo().equalsIgnoreCase("alcoolica")){
            usuario.setTotalCompra(usuario.getTotalCompra()+ calculaImposto(produto));
        } else {
            usuario.setTotalCompra(usuario.getTotalCompra()+produto.getPreco());
        }

        if (usuario.getNumDependentes() > 3){

        }

        if (usuario.getIdade() <= 60 && usuario.getNumDependentes() <= 3){
            usuario.setTotalCompra(usuario.getTotalCompra()+ calculaImposto(produto));
        }
        System.out.println("Valor total da compra do cliente "+usuario.getId()+": "+usuario.getTotalCompra());
        return usuario.getTotalCompra();
    }
}
