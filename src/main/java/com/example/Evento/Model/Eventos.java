package com.example.Evento.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Eventos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nomeEvento;
    private String descricao;
    private LocalDate dataEvento;
    private String localEvento;
    private boolean status;
    private int idGestorResponsavel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getIdGestorResponsavel() {
        return idGestorResponsavel;
    }

    public void setIdGestorResponsavel(int idGestorResponsavel) {
        this.idGestorResponsavel = idGestorResponsavel;
    }

}
