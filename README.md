# CURSER

API para gestão de cursos.

## Funcionalidades

- Listar cursos: `GET /cursos`
- Incluir curso: `POST /cursos`
- Adicionar aula ao curso: `POST /cursos/{id}/aulas`
- Adicionar aluno ao curso (matricular): `PUT /cursos/{id}/alunos`
- Incluir usuário (aluno ou instrutor): `POST /usuarios`


## Dependências

- Java 17
- PostgreSQL 14
- Criar objetos de banco: `data/schema.sql`
- Carga inicial: `data/insert.sql`
- Queries úteis: `data/queries.sql`
- Arquivo do docker-compose: `data/docker-compose.yml`
- Arquivo do postman: `data/curser.postman_collection.json`
