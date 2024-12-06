package com.example.Evento.Repository;

import com.example.Evento.Model.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RepositoryEvento extends JpaRepository<Eventos, Integer> {
    Eventos findByNomeEvento(String nomeEvento);
    Eventos findByDataEvento(LocalDate dataEvento);
    List<Eventos> findByIdGestorResponsavel(int idGestorResponsavel);
}
