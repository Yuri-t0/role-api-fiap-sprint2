# 🎓 Role API - Sprint 2 (Java Advanced - FIAP)

Projeto desenvolvido para a **Sprint 2** da disciplina **Java Advanced**, FIAP 2025.

---

## 🚀 Sobre o Projeto

A **Role API** é uma aplicação desenvolvida em **Spring Boot** que gerencia eventos, usuários, locais e presenças.  
Ela foi criada para demonstrar os conhecimentos de **JPA, H2 Database, Controllers REST, Repositórios e Postman**.

---

## 🧱 Estrutura do Projeto

📦 role-api-fiap-sprint2
┣ 📂 src/main/java/com/role/api
┃ ┣ 📂 controller → Controladores REST (ex: EventoController, UsuarioController)
┃ ┣ 📂 model → Entidades JPA (Evento, Usuario, Presenca, LocalEvento)
┃ ┣ 📂 repository → Interfaces que acessam o banco via Spring Data JPA
┃ ┗ 📂 service → Regras de negócio (serviços)
┣ 📂 resources
┃ ┗ 📜 application.properties → Configurações do banco (H2)
┣ 📂 docs → Diagramas, cronograma e testes (Postman)
┣ 📜 pom.xml
┗ 📜 README.md

yaml
Copy code

---

## ⚙️ Tecnologias Utilizadas

- ☕ **Java 21**  
- 🌱 **Spring Boot 3.5**  
- 🧩 **Spring Data JPA**  
- 🗄️ **Banco de Dados H2 (memória)**  
- 🧰 **Lombok**  
- 🧪 **Postman (para testes de API)**  
- 🔧 **Maven**

---

## ▶️ Como Executar

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/Yuri-t0/role-api-fiap-sprint2.git
Abrir o projeto no IntelliJ IDEA ou VS Code

Executar o arquivo principal:

swift
Copy code
src/main/java/com/role/api/RoleApiFiapSprint2Application.java
Acessar no navegador:

🌐 Home: http://localhost:8080

🧠 H2 Console: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:role
User: sa
Password: (deixe em branco)

📚 Endpoints (Sprint 2)
👤 Usuários
Método	Endpoint	Descrição
GET	/usuarios	Lista usuários
GET	/usuarios/{id}	Busca por ID
POST	/usuarios	Cria novo usuário
PUT	/usuarios/{id}	Atualiza usuário
DELETE	/usuarios/{id}	Remove usuário

🎟️ Eventos
Método	Endpoint	Descrição
GET	/eventos	Lista eventos
GET	/eventos/{id}	Busca evento por ID
POST	/eventos	Cadastra evento
PUT	/eventos/{id}	Atualiza evento
DELETE	/eventos/{id}	Exclui evento

📍 Presenças
Método	Endpoint	Descrição
GET	/presencas	Lista presenças
POST	/presencas	Registra presença
Corpo JSON	{ "usuarioId": 1, "eventoId": 1, "status": "CONFIRMADO" }	

🤝 HATEOAS
GET /usuarios/1 retorna:

json
Copy code
{
  "_links": {
    "self": { "href": "/usuarios/1" },
    "all": { "href": "/usuarios" },
    "delete": { "href": "/usuarios/1" }
  }
}
🧩 Diagramas



Relacionamentos:
Usuario 1..* Presenca *..1 Evento e Evento *..1 LocalEvento
Constraints:
FKs em Presenca.usuario_id, Presenca.evento_id, Evento.local_id e Evento.organizador_id.

🧪 Testes (Postman)
A coleção de testes da API está disponível em:

📄 docs/Role API - Sprint 2.postman_collection.json

Inclui testes de GET, POST, PUT e DELETE para todos os recursos.

Todos foram validados no banco H2 com persistência e recuperação funcional.

🎥 Vídeo (pitch + demo)
🔗 Link para o vídeo no YouTube
(Apresenta a proposta tecnológica, público-alvo e demonstração prática da API.)

📅 Cronograma Sprint 2
Atividade	Responsável	Data	Status
Refatoração packages (repositories/domain)	Yuri	05/11	✅
HATEOAS nos recursos principais	Yuri	06/11	✅
Coleção Postman Sprint 2	João	07/11	✅
Diagramas (DER e Classes)	João	08/11	✅
README + Finalizar Entrega /	Yuri	09/11	✅

👥 Integrantes
Adão Yuri Ferreira da Silva (RM 559223) — Backend, banco e integração H2

João Vitor Lopes Santana (RM 560781) — Modelagem, testes e documentação

🏁 Status do Projeto
✅ Finalizado e pronto para entrega da Sprint 2 - Java Advanced (FIAP 2025)
🏷️ Tag: v2.0-sprint2

🔗 Repositório Público
📂 https://github.com/Yuri-t0/role-api-fiap-sprint2
