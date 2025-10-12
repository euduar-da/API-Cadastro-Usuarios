package br.com.cwi.curser.domain;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Aula {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "instrutor_id")
    private Usuario instrutor;

    public Aula(Long id, String titulo, String descricao, Curso curso, Usuario instrutor) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.curso = curso;
        this.instrutor = instrutor;
    }

    public Aula(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Aula() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Usuario getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Usuario instrutor) {
        this.instrutor = instrutor;
    }
}
