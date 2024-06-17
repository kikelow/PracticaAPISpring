package com.AgendaEHP.AgenTime.services;


import com.AgendaEHP.AgenTime.model.Usuario;
import com.AgendaEHP.AgenTime.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario saveUser(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> getUsers(){
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public void deleteUser(Long id) throws IllegalArgumentException{
        usuarioRepository.deleteById(id);
    }

    public Optional<Usuario> getUserById(Long id){
        return usuarioRepository.findById(id);
    }

}
