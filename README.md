🎓 Role API — Sprint 2 (Java Advanced – FIAP)

API em Spring Boot para gerenciar usuários, eventos, locais e presenças.
Entrega da Sprint 2 com JPA, H2, HATEOAS e coleção Postman.

🧱 Estrutura do Projeto
role-api-fiap-sprint2/
├─ src/
│  └─ main/
│     ├─ java/com/role/api/
│     │  ├─ controller/   # Controladores REST (EventoController, UsuarioController, etc.)
│     │  ├─ model/        # Entidades JPA (Evento, Usuario, Presenca, LocalEvento)
│     │  ├─ repository/   # Interfaces Spring Data JPA
│     │  └─ service/      # Regras de negócio
│     └─ resources/
│        ├─ application.properties
│        └─ static/index.html  # Página inicial para evitar Whitelabel
├─ docs/
│  ├─ der.png
│  ├─ classes.png
│  └─ Role API - Sprint 2.postman_collection.json
├─ pom.xml
└─ README.md

🧩 Diagramas

Coloquei os arquivos em docs/der.png e docs/classes.png.
Se os nomes forem diferentes, ajuste os caminhos abaixo.




⚙️ Tecnologias

Java 21

Spring Boot 3.5

Spring Data JPA + Hibernate

H2 Database (memória)

Spring HATEOAS

Lombok

Maven

Postman (coleção de testes)

▶️ Como Executar

Clonar

git clone https://github.com/Yuri-t0/role-api-fiap-sprint2.git


Abrir no IntelliJ (ou VS Code com extensão Java).

Rodar a aplicação
Arquivo principal:

src/main/java/com/role/api/RoleApiFiapSprint2Application.java


Acessos

Home: http://localhost:8080/

H2 Console: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:role

User: sa

Password: (em branco)

📚 Endpoints (Sprint 2)
Usuários
Método	Endpoint	Descrição
GET	/usuarios	Lista usuários
GET	/usuarios/{id}	Busca por ID
POST	/usuarios	Cria usuário
PUT	/usuarios/{id}	Atualiza usuário
DELETE	/usuarios/{id}	Remove usuário
Eventos
Método	Endpoint	Descrição
GET	/eventos	Lista eventos
GET	/eventos/{id}	Busca por ID
POST	/eventos	Cria evento
PUT	/eventos/{id}	Atualiza evento
DELETE	/eventos/{id}	Exclui evento
Presenças
Método	Endpoint	Descrição
GET	/presencas	Lista presenças
POST	/presencas	Registra presença

Body (exemplo)

{
  "usuarioId": 1,
  "eventoId": 1,
  "status": "CONFIRMADO"
}

🔗 HATEOAS (exemplo de retorno GET /usuarios/1)
{
  "id": 1,
  "nome": "Yuri",
  "email": "yuri@role.com",
  "_links": {
    "self": { "href": "http://localhost:8080/usuarios/1" },
    "all":  { "href": "http://localhost:8080/usuarios" },
    "delete": { "href": "http://localhost:8080/usuarios/1" }
  }
}

🧪 Testes no Postman

Coleção pronta: docs/Role API - Sprint 2.postman_collection.json

Importe no Postman: Import → File → selecione o .json

Configure a variável baseUrl (na aba Variables da coleção) com:

http://localhost:8080

🎥 Vídeo (pitch + demo)

Link: [coloque aqui o link do seu vídeo de 1m04].

Dica: se precisar transcrever/legendar seu áudio, tente Veed.io, Descript ou Fliki (todas online e simples de usar).

👥 Integrantes

Adão Yuri Ferreira da Silva (RM 559223) – Backend, banco e integração H2

João Vitor Lopes Santana (RM 560781) – Modelagem, testes e documentação

✅ Conformidade com a Rubrica

Evolução desde a Sprint 1: refatoração de pacotes, inclusão de HATEOAS, README completo.

Docs: README, diagramas (DER e Classes), vídeo e coleção Postman em docs/.

Gestão de Configuração: repositório público com todo o conteúdo.

Testes: coleção Postman exportada e pronta para validação.
