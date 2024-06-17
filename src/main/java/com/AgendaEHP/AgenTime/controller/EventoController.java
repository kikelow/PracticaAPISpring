package com.AgendaEHP.AgenTime.controller;

import com.AgendaEHP.AgenTime.model.Evento;
import com.AgendaEHP.AgenTime.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    EventoService eventoService;

    @GetMapping
    public List<Evento> getEvents(){
        return eventoService.getAllEvents();
    }

    @PostMapping
    public Evento createEvent(@RequestBody Evento evento){
        return eventoService.save(evento);
    }
}
