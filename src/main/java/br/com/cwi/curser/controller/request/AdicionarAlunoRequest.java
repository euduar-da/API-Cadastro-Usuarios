package br.com.cwi.curser.controller.request;

import jakarta.validation.constraints.NotNull;

public class AdicionarAlunoRequest {

    @NotNull
    private Long usuarioId;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}