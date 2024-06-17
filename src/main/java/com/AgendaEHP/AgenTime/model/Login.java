package com.AgendaEHP.AgenTime.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private long Id;
    private String username;
    private String clave;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_login")
    private Date fechaLogin;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_logout")
    private Date fechaLogout;

//    @ManyToOne()
//    @JoinColumn(name = "usuario_id")
//    private Usuario usuario;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFechaLogin() {
        return fechaLogin;
    }

    public void setFechaLogin(Date fechaLogin) {
        this.fechaLogin = fechaLogin;
    }

    public Date getFechaLogout() {
        return fechaLogout;
    }

    public void setFechaLogout(Date fechaLogout) {
        this.fechaLogout = fechaLogout;
    }

//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }
}