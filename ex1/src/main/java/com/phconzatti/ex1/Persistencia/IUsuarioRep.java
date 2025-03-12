package com.phconzatti.ex1.Persistencia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.phconzatti.ex1.Entidades.Usuario;

public interface IUsuarioRep extends CrudRepository<Usuario,Long>{
    List <Usuario> findAll();
    Usuario findById(long id);

}
