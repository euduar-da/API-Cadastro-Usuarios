-- Usuarios
select id, email, nome
from usuario

-- Cursos
select c.id as "cursoId",
       c.titulo as "cursoTitulo",
	   a.id as "aulaId",
	   a.titulo as "aulaTitulo",
	   i.id as "instrutorId",
	   i.nome as "instrutorNome"
  from curso c
       left join aula a on a.curso_id = c.id
	   left join usuario i on i.id = a.instrutor_id
;

-- Alunos
select c.id as "cursoId",
       c.titulo as "cursoTitulo",
	   al.id as "alunoId",
	   al.nome as "alunoNome"
  from curso c
	   left join curso_aluno ca on ca.curso_id = c.id
	   left join usuario al on al.id = ca.aluno_id
;