 INSERT INTO usuario (id, nome, email, telefone, criado_em)
VALUES (1, 'Yuri', 'yuri@role.com', '+55 11 99999-0000', CURRENT_TIMESTAMP());

INSERT INTO usuario (id, nome, email, telefone, criado_em)
VALUES (2, 'João Vitor', 'joao@role.com', '+55 11 98888-0000', CURRENT_TIMESTAMP());

 INSERT INTO local_evento (id, nome, endereco, latitude, longitude)
VALUES (1, 'Bar da Paulista', 'Av. Paulista, 1000', -23.56, -46.65);


INSERT INTO evento (id, titulo, descricao, inicio, fim, organizador_id, local_id)
VALUES (
  1,
  'Rolê na Paulista',
  'Bar + show + jantar com os amigos',
  TIMESTAMP '2025-10-10 20:00:00',
  TIMESTAMP '2025-10-11 01:00:00',
  1,
  1
);

 INSERT INTO presenca (id, usuario_id, evento_id, status, atualizado_em)
VALUES (1, 1, 1, 'CONFIRMADO', CURRENT_TIMESTAMP());

INSERT INTO presenca (id, usuario_id, evento_id, status, atualizado_em)
VALUES (2, 2, 1, 'PENDENTE', CURRENT_TIMESTAMP());
