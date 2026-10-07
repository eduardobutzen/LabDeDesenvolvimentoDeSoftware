CREATE DATABASE BDAula01;

SHOW DATABASES;

USE BDAula01;

CREATE TABLE pessoa
(
	id int auto_increment PRIMARY KEY,
    nome varchar(50) NOT NULL,
    sexo varchar(1) NOT NULL,
    idioma varchar(10) NOT NULL
);
 
SHOW TABLES;
DESC pessoa;
 
INSERT INTO pessoa(nome, sexo, idioma)
VALUES
('João Silva', 'M', 'Português'),
('Maria Souza', 'F', 'Português'),
('Carlos Oliveira', 'M', 'Inglês'),
('Ana Costa', 'F', 'Espanhol'),
('Pedro Santos', 'M', 'Francês'),
('Julia Almeida', 'F', 'Alemão'),
('Lucas Pereira', 'M', 'Italiano'),
('Beatriz Lima', 'F', 'Japonês'),
('Rafael Gomes', 'M', 'Português'),
('Camila Rocha', 'F', 'Inglês'),
('Bruno Martins', 'M', 'Espanhol'),
('Larissa Alves', 'F', 'Francês'),
('Gabriel Ribeiro', 'M', 'Alemão'),
('Fernanda Dias', 'F', 'Italiano'),
('Diego Carvalho', 'M', 'Português');

SELECT *
FROM pessoa;
