INSERT INTO usuario (nome, email) values ('Zanatta', 'zanatta@cwi.com.br');
INSERT INTO usuario (nome, email) values ('Cadu', 'carlos.couto@cwi.com.br');
INSERT INTO usuario (nome, email) values ('Renan Lessa', 'renan.rosa@cwi.com.br');

INSERT INTO curso (titulo, tipo, nivel, ativo, data_inicio)
values ('Curso de Java', 'EAD', 'INTERMEDIARIO', true, TO_DATE('2025-01-01','YYYY-MM-DD'));

INSERT INTO aula (titulo, descricao, curso_id, instrutor_id) values ('Primeira aula', 'Aula de apresentação', 1, 1);
INSERT INTO aula (titulo, descricao, curso_id, instrutor_id) values ('Segunda aula', 'Nesta aula vamos fazer o setup do curso', 1, 2);

INSERT INTO curso_aluno (curso_id, aluno_id) values (1, 3);
INSERT INTO curso_aluno (curso_id, aluno_id) values (1, 4);