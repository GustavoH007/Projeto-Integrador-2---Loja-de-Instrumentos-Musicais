CREATE DATABASE lojainstrumentosmusicais;
USE lojainstrumentosmusicais;

CREATE TABLE Cliente (
    CPF VARCHAR(15) PRIMARY KEY NOT NULL,
    Nome VARCHAR(80) NOT NULL,
    Nascimento DATE,
    Rua VARCHAR(50) NOT NULL,
    Bairro VARCHAR(25) NOT NULL,
    CEP VARCHAR(9) NOT NULL,
    Cidade VARCHAR(20) NOT NULL,
    UF VARCHAR(2) NOT NULL,
    Telefone VARCHAR(16),
    Telefone_Opc VARCHAR(16),
    Email VARCHAR(75) NOT NULL,
    Genero VARCHAR(21) NOT NULL,
    Estado_Civil VARCHAR(13)
);

CREATE TABLE Produto(
	ID INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(80) NOT NULL,
    Categoria VARCHAR(25) NOT NULL,
    Descricao VARCHAR(200),
    Cor VARCHAR(20),
    Valor_Custo DOUBLE NOT NULL,
    Valor_Venda DOUBLE NOT NULL,
    Quantidade INT NOT NULL
);

CREATE TABLE Venda(
	ID_Venda INT PRIMARY KEY AUTO_INCREMENT,
    CPF_Cliente VARCHAR(15) NOT NULL,
    Valor_Total DOUBLE NOT NULL,
    Data_Venda DATE NOT NULL,
    FOREIGN KEY (CPF_Cliente) REFERENCES Cliente(CPF)
);

CREATE TABLE Relatorio(
	ID_Relatorio INT PRIMARY KEY AUTO_INCREMENT,
    ID_Venda INT NOT NULL,
    ID_Produto INT NOT NULL,
    QTD_Produto INT NOT NULL,
    Valor_Produto DOUBLE NOT NULL,
    FOREIGN KEY (ID_Venda) REFERENCES Venda(ID_Venda),
    FOREIGN KEY (ID_Produto) REFERENCES Produto(ID)
);