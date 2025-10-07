package com.example.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario,String>{

    
}
