package com.example.Evento.Service;

import com.example.Evento.Model.Eventos;
import com.example.Evento.Repository.RepositoryEvento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEventos {

    @Autowired
    private RepositoryEvento repo;

    public List<Eventos> buscarEventos() {
        return repo.findAll();
    }

    public Eventos buscarEvento(String nome) {
        return repo.findByNomeEvento(nome);
    }

    public Eventos criarEvento(Eventos a) {
        return repo.save(a);
    }

    public Eventos deletarEvento(Eventos a) {
        Optional<Eventos> isEvento = repo.findById(a.getId());
        if (isEvento.isPresent()) {
            repo.delete(a);
            return isEvento.get();
        }
        return null;
    }

    public List<Eventos> buscarPorGestor(Eventos a) {
        return repo.findByIdGestorResponsavel(a.getIdGestorResponsavel());
    }

    public Eventos atualizarEvento(int Idevento, Eventos atualizado) throws Exception {
        Optional<Eventos> evento = repo.findById(Idevento);

        if (evento.isEmpty()) {
            throw new Exception("Evento não encontrado para o ID fornecido");
        }

        evento.get().setDataEvento(atualizado.getDataEvento());
        evento.get().setDescricao(atualizado.getDescricao());
        evento.get().setNomeEvento(atualizado.getNomeEvento());
        evento.get().setLocalEvento(atualizado.getLocalEvento());
        evento.get().setIdGestorResponsavel(atualizado.getIdGestorResponsavel());
        return repo.save(evento.get());
    }

    public Eventos cancelarEvento(int Idevento) throws Exception {
        Optional<Eventos> evento = repo.findById(Idevento);
        if (evento.isEmpty()) {
            throw new Exception("Evento não encontrado");
        }

        if (evento.get().isStatus()) {
            evento.get().setStatus(false);
            return repo.save(evento.get());
        } else {
            throw new Exception("Evento já está cancelado");
        }
    }
}
