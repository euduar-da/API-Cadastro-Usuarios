package br.com.cwi.curser.service;

import br.com.cwi.curser.controller.request.AdicionarAlunoRequest;
import br.com.cwi.curser.domain.Curso;
import br.com.cwi.curser.domain.Usuario;
import br.com.cwi.curser.repository.CursoRepository;
import org.springframework.stereotype.Service;

@Service
public class AdicionarAlunoService {

    private final BuscarCursoService buscarCursoService;
    private final BuscarUsuarioService buscarUsuarioService;
    private final CursoRepository cursoRepository;

    public AdicionarAlunoService(BuscarCursoService buscarCursoService,
                                 BuscarUsuarioService buscarUsuarioService,
                                 CursoRepository cursoRepository) {
        this.buscarCursoService = buscarCursoService;
        this.buscarUsuarioService = buscarUsuarioService;
        this.cursoRepository = cursoRepository;
    }

    public void adicionarAluno(Long cursoId, AdicionarAlunoRequest request) {
        Curso curso = buscarCursoService.porId(cursoId);
        Usuario usuario = buscarUsuarioService.porId(request.getUsuarioId());

        curso.getAlunos().add(usuario);

        cursoRepository.save(curso);
    }
}