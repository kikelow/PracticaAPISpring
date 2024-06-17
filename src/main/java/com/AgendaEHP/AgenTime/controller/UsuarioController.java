package com.AgendaEHP.AgenTime.controller;


import com.AgendaEHP.AgenTime.model.Usuario;
import com.AgendaEHP.AgenTime.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario saveUser(@RequestBody Usuario usuario){
        return usuarioService.saveUser(usuario);
    }

    @GetMapping
    public List<Usuario> getUser(){
        return usuarioService.getUsers();
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id){
        try{
            usuarioService.deleteUser(id);
            return String.format("Usuario con Id-%s, elimnado",id);
        }catch (IllegalArgumentException a){
            return "Valor recibido null";
        }
    }

    @GetMapping("/{id}")
    public Usuario getUserById(@PathVariable Long id){
        return usuarioService.getUserById(id).orElseThrow();
    }
}
