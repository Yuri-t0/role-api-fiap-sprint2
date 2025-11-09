package com.role.api.controller;

import com.role.api.model.Usuario;
import com.role.api.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository repo;

    public UsuarioController(UsuarioRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Usuario> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscar(@PathVariable Long id) {
        return repo.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EntityModel<Usuario>> criar(@Valid @RequestBody Usuario usuario) {
         Usuario salvo = repo.save(usuario);

        EntityModel<Usuario> model = EntityModel.of(salvo)
                .add(linkTo(methodOn(UsuarioController.class).buscar(salvo.getId())).withSelfRel())
                .add(linkTo(methodOn(UsuarioController.class).listar()).withRel("lista"));

        return ResponseEntity.created(URI.create("/usuarios/" + salvo.getId())).body(model);
    }
}
