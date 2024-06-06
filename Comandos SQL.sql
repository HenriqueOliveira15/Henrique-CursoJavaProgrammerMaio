CREATE TABLE pessoa ( -- Comando para criar a tabela
	cpf VARCHAR (11),
    nome VARCHAR (100),
    email VARCHAR (100)
);


select * from pessoa; -- Comando para exibir os dados da tabela

insert into pessoa (cpf, nome, email) values ('23', 'Henrique', 'email.com'); -- Inserindo dados na tabela pessoa


