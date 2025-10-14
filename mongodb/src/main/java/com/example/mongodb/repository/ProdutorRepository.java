package com.example.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.Produtor;

public interface ProdutorRepository extends MongoRepository<Produtor,String>{

}
