package com.role.api.controller;

import com.role.api.model.Evento;
import com.role.api.repository.EventoRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private final EventoRepository repository;

    public EventoController(EventoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Evento> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public EntityModel<Evento> buscar(@PathVariable Long id) {
        Evento evento = repository.findById(id).orElseThrow();
        EntityModel<Evento> resource = EntityModel.of(evento);
        resource.add(WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(EventoController.class).listar()).withRel("todos-eventos"));
        return resource;
    }

    @PostMapping
    public Evento criar(@RequestBody Evento evento) {
        return repository.save(evento);
    }
}
