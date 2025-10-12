package br.com.cwi.curser.service;

import br.com.cwi.curser.controller.request.IncluirCursoRequest;
import br.com.cwi.curser.controller.response.IdResponse;
import br.com.cwi.curser.domain.Curso;
import br.com.cwi.curser.repository.CursoRepository;
import org.springframework.stereotype.Service;

import static br.com.cwi.curser.mapper.IdResponseMapper.toResponse;
import static br.com.cwi.curser.mapper.IncluirCursoMapper.toEntity;

@Service
public class IncluirCursoService {

    private final ValidaTituloCursoService validaTituloCursoService;
    private final CursoRepository cursoRepository;

    public IncluirCursoService(ValidaTituloCursoService validaTituloCursoService, CursoRepository cursoRepository) {
        this.validaTituloCursoService = validaTituloCursoService;
        this.cursoRepository = cursoRepository;
    }

    public IdResponse incluir(IncluirCursoRequest request) {

        validaTituloCursoService.validar(request.getTitulo());

        Curso curso = toEntity(request);
        curso.setAtivo(true);

        cursoRepository.save(curso);

        return toResponse(curso.getId());
    }
}
