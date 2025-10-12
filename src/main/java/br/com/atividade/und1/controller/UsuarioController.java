package br.com.atividade.und1.controller;

import br.com.atividade.und1.controller.request.UsuarioRequest;
import br.com.atividade.und1.controller.response.UsuarioResponse;
import br.com.atividade.und1.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService incluirUsuarioService;



    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UsuarioResponse incluir(@Valid @RequestBody UsuarioRequest request) {
        return incluirUsuarioService.incluir(request);
    }
}