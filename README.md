# 🎓 Role API - Sprint 2 (Java Advanced - FIAP)

Projeto desenvolvido para a **Sprint 2** da disciplina **Java Advanced**, FIAP 2025.

---

## 🚀 Sobre o projeto

A **Role API** é uma aplicação desenvolvida em **Spring Boot** que gerencia eventos, usuários, locais e presenças.  
Ela foi criada para demonstrar os conhecimentos de **JPA, H2 Database, Controllers REST, Repositórios e Postman**.

---

## 🧱 Estrutura do projeto

📦 role-api-fiap-sprint2
┣ 📂 src/main/java/com/role/api
┃ ┣ 📂 controller → Controladores REST (ex: EventoController, UsuarioController)
┃ ┣ 📂 model → Entidades JPA (Evento, Usuario, Presenca, LocalEvento)
┃ ┣ 📂 repository → Interfaces que acessam o banco via Spring Data JPA
┃ ┗ 📂 service → Regras de negócio (serviços)
┣ 📂 resources
┃ ┗ 📜 application.properties → Configurações do banco (H2)
┣ 📜 pom.xml
┣ 📜 README.md
┗ 📜 docs/Role API - Sprint 2.postman_collection.json

yaml
Copy code

---

## ⚙️ Tecnologias Utilizadas

- Java 21  
- Spring Boot 3.5  
- Spring Data JPA  
- Banco de Dados H2  
- Lombok  
- Postman (para testes de API)  
- Maven  

---

## ▶️ Como Executar

1. Clonar o repositório:
   ```bash
   git clone https://github.com/Yuri-t0/role-api-fiap-sprint2.git
Abrir o projeto no IntelliJ IDEA ou VS Code.

Executar o arquivo principal:

swift
Copy code
src/main/java/com/role/api/RoleApiFiapSprint2Application.java
Acessar no navegador:

arduino
Copy code
http://localhost:8080
🧪 Testes de API (Postman)
Arquivo de coleção Postman disponível em:

pgsql
Copy code
docs/Role API - Sprint 2.postman_collection.json
Endpoints principais:

Método	Endpoint	Descrição
GET	/usuarios	Lista todos os usuários
POST	/usuarios	Cria um novo usuário
GET	/eventos	Lista todos os eventos
POST	/eventos	Cadastra um novo evento

👥 Integrantes
Yuri Ferreira (RM: 559223)

João Vitor Lopes Santana (RM: 560781)

🏁 Status do Projeto
✅ Finalizado e pronto para entrega da Sprint 2 - Java Advanced (FIAP 2025)
