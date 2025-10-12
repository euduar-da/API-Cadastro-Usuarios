package br.com.cwi.curser.mapper;

import br.com.cwi.curser.controller.request.AdicionarAulaRequest;
import br.com.cwi.curser.domain.Aula;

public class AdicionarAulaMapper {

    public static Aula toEntity(AdicionarAulaRequest request) {
        return new Aula(request.getTitulo(), request.getDescricao());
    }
}
