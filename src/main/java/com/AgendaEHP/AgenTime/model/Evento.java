package com.AgendaEHP.AgenTime.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private long Id;
    private String nombre;
    private String descripcion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion_evento")
    private Date fechaCreacionEvento;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_ejecucion_evento")
    private Date fechaEjecucionEvento;


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacionEvento() {
        return fechaCreacionEvento;
    }

    public void setFechaCreacionEvento(Date fechaCreacionEvento) {
        this.fechaCreacionEvento = fechaCreacionEvento;
    }

    public Date getFechaEjecucionEvento() {
        return fechaEjecucionEvento;
    }

    public void setFechaEjecucionEvento(Date fechaEjecucionEvento) {
        this.fechaEjecucionEvento = fechaEjecucionEvento;
    }

}