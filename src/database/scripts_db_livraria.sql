
CREATE DATABASE livraria;

use livraria;

CREATE TABLE autores (
  id int PRIMARY KEY AUTO_INCREMENT,
  nome varchar(255),
  email varchar(255),
  dataNascimento date,
  miniCurriculo varchar(500)
);

