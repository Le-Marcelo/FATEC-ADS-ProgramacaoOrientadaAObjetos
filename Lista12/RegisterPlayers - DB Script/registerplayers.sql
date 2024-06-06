CREATE DATABASE registrarjogadores;
USE registrarjogadores;

CREATE TABLE time(
	numero INTEGER(10) NOT NULL PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	nomeCidade VARCHAR(50) NOT NULL
);

CREATE TABLE jogador(
	numero INTEGER(10) NOT NULL PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	dataNasc DATE NOT NULL,
	altura DECIMAL(3,2) NOT NULL,
	peso DECIMAL(5,2) NOT NULL,
	numTime INTEGER(10), FOREIGN KEY (numTime) REFERENCES time (numero)
);