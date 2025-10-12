package br.com.cwi.curser.controller;

import br.com.cwi.curser.controller.request.IncluirUsuarioRequest;
import br.com.cwi.curser.controller.response.IdResponse;
import br.com.cwi.curser.service.IncluirUsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final IncluirUsuarioService incluirUsuarioService;

    public UsuarioController(IncluirUsuarioService incluirUsuarioService) {
        this.incluirUsuarioService = incluirUsuarioService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public IdResponse incluir(@Valid @RequestBody IncluirUsuarioRequest request) {
        return incluirUsuarioService.incluir(request);
    }
}