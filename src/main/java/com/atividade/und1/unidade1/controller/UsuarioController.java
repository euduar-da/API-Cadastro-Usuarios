package com.atividade.und1.unidade1.controller;

import com.atividade.und1.unidade1.controller.request.UsuarioRequest;
import com.atividade.und1.unidade1.controller.response.UsuarioResponse;
import com.atividade.und1.unidade1.repository.UsuarioRepository;
import com.atividade.und1.unidade1.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioService usuarioService;



    @PostMapping
    public UsuarioResponse incluir(@Valid @RequestBody UsuarioRequest request) {
        return usuarioService.incluir(request);
    }

    @GetMapping
    public List<UsuarioResponse> listarUsuarios() {
        return usuarioService.listar();
    }
}