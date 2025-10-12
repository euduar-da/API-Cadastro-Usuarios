package br.com.cwi.curser.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String titulo;

    @Enumerated(STRING)
    private Tipo tipo;

    @Enumerated(STRING)
    private Nivel nivel;

    private LocalDate dataInicio;
    private boolean ativo;

    @OneToMany(mappedBy = "curso")
    private List<Aula> aulas = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "curso_aluno",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "aluno_id"))
    private List<Usuario> alunos = new ArrayList<>();

    public Curso(Long id, String titulo, Tipo tipo, Nivel nivel, LocalDate dataInicio, boolean ativo, List<Aula> aulas, List<Usuario> alunos) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.nivel = nivel;
        this.dataInicio = dataInicio;
        this.ativo = ativo;
        this.aulas = aulas;
        this.alunos = alunos;
    }

    public Curso(String titulo, Tipo tipo, Nivel nivel, LocalDate dataInicio) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.nivel = nivel;
        this.dataInicio = dataInicio;
    }

    public Curso() {}

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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public List<Usuario> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Usuario> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
