Rolê – API FIAP Sprint 2
🧩 Integrantes

Adão Yuri Ferreira da Silva (RM 559223) – Backend, banco de dados H2 e integração

João Vitor Lopes Santana (RM 560781) – Modelagem, testes e documentação

📘 Descrição da Aplicação

O Rolê é uma API REST desenvolvida em Spring Boot 3.5.4, cujo objetivo é gerenciar eventos sociais criados por usuários.
Permite cadastrar usuários, locais, eventos e presenças, oferecendo uma camada de dados totalmente relacional com H2 Database (modo Oracle).

Esta Sprint 2 teve como foco:

Evolução do código entregue na Sprint 1;

Refatoração das entidades e repositórios;

Implementação de HATEOAS (maturidade 3 – Leonard Richardson);

Organização de pacotes conforme boas práticas de REST e Spring Data JPA.

🚀 Evoluções da Sprint 2

✅ Implementação do padrão HATEOAS, permitindo navegação entre recursos com links dinâmicos.
✅ Refatoração da estrutura de pacotes (controller, domain, repository).
✅ Correção do DER com nomes consistentes (snake_case).
✅ Inclusão de dados de exemplo automáticos via data.sql.
✅ Testes atualizados no Postman para CRUD completo de eventos e usuários.
✅ Manutenção do banco H2 para validação local sem dependência externa.

🧱 Arquitetura da Solução

Camada Controller: Exposição dos endpoints RESTful e links HATEOAS.

Camada Service/Domain: Regras de negócio e entidades JPA mapeadas com Hibernate.

Camada Repository: Interfaces Spring Data JPA para persistência no H2.

Camada Infraestrutura: Configurações de banco e dados de inicialização.

🗄️ Banco de Dados

Banco: H2 Database (em memória)

URL: jdbc:h2:mem:role

Usuário: sa

Senha: (vazio)

Console: http://localhost:8080/h2-console

🧩 Como Rodar a Aplicação

Certifique-se de ter Java 21 instalado.

Abra o projeto no IntelliJ ou VS Code.

Execute o comando:

mvn spring-boot:run


A aplicação estará disponível em:

http://localhost:8080

🔗 Endpoints Principais
Método	Endpoint	Descrição
GET	/eventos	Lista todos os eventos (HATEOAS ativo)
GET	/eventos/{id}	Detalha um evento específico
POST	/eventos	Cria novo evento
PUT	/eventos/{id}	Atualiza um evento existente
DELETE	/eventos/{id}	Exclui um evento
GET	/usuarios	Lista usuários cadastrados
POST	/usuarios	Cadastra novo usuário
GET	/h2-console	Console H2 para consulta direta
📈 Diagramas

DER – Sprint 2:


Diagrama de Classes:


🧪 Testes de API

Os testes foram realizados via Postman e exportados para o arquivo:
📄 docs/postman_collection_sprint2.json

Incluem:

CRUD completo de usuários, eventos e presenças;

Validação dos links HATEOAS;

Teste de persistência no H2 após inicialização.

🧭 Cronograma de Desenvolvimento
Data	Responsável	Atividade
03/11	Yuri	Refatoração das entidades e repos Spring Data JPA
04/11	João Vitor	Testes Postman e validação HATEOAS
05/11	Yuri	Ajustes finais no DER e documentação README
06/11	Equipe	Gravação do vídeo e upload no GitHub
🎥 Vídeo da Sprint 2

📎 Link do vídeo – apresentação da Sprint 2 (no YouTube/Drive)

(inserir quando o vídeo estiver publicado)

🏁 Conclusão

O projeto Rolê evoluiu nesta Sprint com implementações de melhor qualidade de código, adesão aos níveis avançados de REST, e refatoração completa das entidades.
A API encontra-se totalmente funcional e documentada para validação acadêmica na Sprint 2.