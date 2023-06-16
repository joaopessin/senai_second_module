CREATE DATABASE fashion_foot
CHARACTER SET utf8mb4
COLLATE utf8mb4_general_ci;

USE fashion_foot;

CREATE TABLE cadastro_produto(
id SMALLINT PRIMARY KEY AUTO_INCREMENT,
codigo VARCHAR(100) NOT NULL,
nome VARCHAR(55),
condicao VARCHAR(55),
tamanho VARCHAR(55),
unidades smallint,
categoria VARCHAR(55),
preco DECIMAL(6,2),
valor_venda DECIMAL(6,2),
peso DECIMAL(6,3),
descricao TEXT
);

CREATE TABLE cliente(
id INT AUTO_INCREMENT PRIMARY KEY,
senha CHAR(14) NOT NULL,
nome_completo VARCHAR (255) NOT NULL,
data_nasc DATE NOT NULL,
telefone BIGINT(14) NOT NULL,
cpf VARCHAR (14) NOT NULL,
email VARCHAR(255),
estado VARCHAR(255),
cidade VARCHAR(255),
rua VARCHAR(255),
number_casa INT(2),
cep CHAR(9) NOT NULL
);

create table funcionario(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(55) NOT NULL,
sobrenome VARCHAR(55) NOT NULL,
data_nascimento DATE,
sexo VARCHAR(55),
cpf VARCHAR (14),
rg VARCHAR(20),
estado_civil VARCHAR(55),
email VARCHAR(155), 
cep CHAR(9),
estado VARCHAR(55),
bairro VARCHAR(44),
numero VARCHAR(55),
telefone BIGINT(14),
senha VARCHAR(100) NOT NULL
);

CREATE TABLE estoque(
id INT AUTO_INCREMENT PRIMARY KEY,
codigo INT(14) NOT NULL,
nome VARCHAR(60),
unidade BIGINT(10),
valor_inicial DECIMAL(6, 2),
valor_frete DECIMAL(6, 2),
valor_total DECIMAL(6, 2),
total_vendas INT(10),
cod_barra BIGINT(14),
tipo_produto VARCHAR(60)
);

CREATE TABLE pagamento(
id_usuario SMALLINT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(60) NOT NULL,
data_nascimento DATE NOT NULL,
numero_cpf_cnpj VARCHAR(14) NOT NULL,
nome_cartao VARCHAR(60),
numero_cartao VARCHAR(20),
mes_validade CHAR(3),
ano_validade CHAR(4),
cvv INT(3),
parcelas VARCHAR(12)
);

CREATE TABLE agendamento(
horario VARCHAR (40),
nome VARCHAR (60),
idade INT (3),
endereco VARCHAR (60),
categoria VARCHAR (60)
);

CREATE USER 'ff_layson'@'localhost' IDENTIFIED BY '123456';
GRANT SELECT, INSERT, UPDATE, DELETE ON `fashion_foot`.* TO 'ff_layson';

CREATE USER 'ff_lucas'@'localhost' IDENTIFIED BY '123456';
GRANT SELECT, INSERT, UPDATE, DELETE ON `fashion_foot`.* TO 'ff_lucas';

CREATE USER 'ff_joao'@'localhost' IDENTIFIED BY 'senha0123';
GRANT SELECT, INSERT, UPDATE, DELETE ON `fashion_foot`.* TO 'ff_joao';
