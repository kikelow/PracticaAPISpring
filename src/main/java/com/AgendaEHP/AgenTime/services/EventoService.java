package com.AgendaEHP.AgenTime.services;

import com.AgendaEHP.AgenTime.model.Evento;
import com.AgendaEHP.AgenTime.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    EventoRepository eventoRepository;

    public List<Evento> getAllEvents(){
        return (List<Evento>) eventoRepository.findAll();
    }

    public Evento save(Evento evento){
        return eventoRepository.save(evento);
    }
}
