package br.com.cwi.curser.controller;

import br.com.cwi.curser.controller.request.AdicionarAlunoRequest;
import br.com.cwi.curser.controller.request.AdicionarAulaRequest;
import br.com.cwi.curser.controller.request.IncluirCursoRequest;
import br.com.cwi.curser.controller.response.CursoResumidoResponse;
import br.com.cwi.curser.controller.response.IdResponse;
import br.com.cwi.curser.service.AdicionarAlunoService;
import br.com.cwi.curser.service.AdicionarAulaService;
import br.com.cwi.curser.service.IncluirCursoService;
import br.com.cwi.curser.service.ListarCursosService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final ListarCursosService listarCursosService;
    private final IncluirCursoService incluirCursoService;
    private final AdicionarAulaService adicionarAulaService;
    private final AdicionarAlunoService adicionarAlunoService;

    public CursoController(ListarCursosService listarCursosService,
                           IncluirCursoService incluirCursoService,
                           AdicionarAulaService adicionarAulaService,
                           AdicionarAlunoService adicionarAlunoService) {
        this.listarCursosService = listarCursosService;
        this.incluirCursoService = incluirCursoService;
        this.adicionarAulaService = adicionarAulaService;
        this.adicionarAlunoService = adicionarAlunoService;
    }

    @GetMapping
    public List<CursoResumidoResponse> listar() {
        return listarCursosService.listarAtivos();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public IdResponse incluir(@Valid @RequestBody IncluirCursoRequest request) {
        return incluirCursoService.incluir(request);
    }

    @PostMapping("/{id}/aulas")
    @ResponseStatus(CREATED)
    public IdResponse adicionarAula(@PathVariable Long id, @Valid @RequestBody AdicionarAulaRequest request) {
        return adicionarAulaService.adicionar(id, request);
    }

    @PutMapping("/{id}/alunos")
    @ResponseStatus(NO_CONTENT)
    public void adicionarAluno(@PathVariable Long id, @Valid @RequestBody AdicionarAlunoRequest request) {
        adicionarAlunoService.adicionarAluno(id, request);
    }

}