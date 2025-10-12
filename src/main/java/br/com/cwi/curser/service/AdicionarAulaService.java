package br.com.cwi.curser.service;

import br.com.cwi.curser.controller.request.AdicionarAulaRequest;
import br.com.cwi.curser.controller.response.IdResponse;
import br.com.cwi.curser.domain.Aula;
import br.com.cwi.curser.domain.Curso;
import br.com.cwi.curser.domain.Usuario;
import br.com.cwi.curser.repository.AulaRepository;
import org.springframework.stereotype.Service;

import static br.com.cwi.curser.mapper.AdicionarAulaMapper.toEntity;
import static br.com.cwi.curser.mapper.IdResponseMapper.toResponse;

@Service
public class AdicionarAulaService {

    private final BuscarCursoService buscarCursoService;
    private final BuscarUsuarioService buscarUsuarioService;
    private final AulaRepository aulaRepository;

    public AdicionarAulaService(BuscarCursoService buscarCursoService,
                                BuscarUsuarioService buscarUsuarioService,
                                AulaRepository aulaRepository) {
        this.buscarCursoService = buscarCursoService;
        this.buscarUsuarioService = buscarUsuarioService;
        this.aulaRepository = aulaRepository;
    }

    public IdResponse adicionar(Long idCurso, AdicionarAulaRequest request) {
        Curso curso = buscarCursoService.porId(idCurso);
        Usuario instrutor = buscarUsuarioService.porId(request.getInstrutorId());

        Aula aula = toEntity(request);

        aula.setInstrutor(instrutor);
        aula.setCurso(curso);

        aulaRepository.save(aula);

        return toResponse(aula.getId());
    }
}
