package com.phconzatti.ex1.Persistencia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.phconzatti.ex1.Entidades.Produto;

public interface IProdutoRep extends CrudRepository<Produto,Long>{
    List<Produto> findAll();
    Produto findById(long id);
    
}
