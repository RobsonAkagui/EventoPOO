package com.example.Evento.Controller;

import com.example.Evento.Model.Eventos;
import com.example.Evento.Service.ServiceEventos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ControllerEventos {

    @Autowired
    private ServiceEventos eventos;

    @GetMapping("eventos")
    public List<Eventos> eventos() {
        return eventos.buscarEventos();
    }


}
