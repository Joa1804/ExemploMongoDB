package com.example.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.model.Usuario;
import com.example.mongodb.service.UsuarioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> ListTodos(){
        return usuarioService.ListTodos();
    }

    @GetMapping("/{id}") 
    public Optional<Usuario> buscaporid(@PathVariable String id){
        return usuarioService.buscaporid(id);
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario){
        return usuarioService.salvar(usuario);
    }

    @PutMapping("/{id}") 
    public Usuario atualizar(@PathVariable String id, @RequestBody Usuario usuario) { 
        return usuarioService.atualizar(id, usuario); 
    } 

    @DeleteMapping("/{id}") 
    public void deletar(@PathVariable String id) { 
         usuarioService.deletar(id); 
    } 

}
