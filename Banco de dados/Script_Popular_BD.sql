--Este script serve para gerar informações no seu banco de dados para facilitar a visualização de informações.
--Caso já tenha dados no seu banco de dados, pode ocorrer conflito de chaves ao inserir, mas pode ser ignorado.

insert into socios values (1,'Gabriel','Rua','Fone','LocalTrabalho','FoneCom',1, '111', 10/10/1987,1,1);
insert into socios values (2,'Rafael','Rua','Fone','LocalTrabalho','FoneCom',1, '222', 10/10/1987,1,1);
insert into socios values (3,'Joao','Rua','Fone','LocalTrabalho','FoneCom',1, '333', 10/10/1987,1,1);
insert into dependentes values (3,3,'Rafael Socio', 1, 10/10/1987,39395);
insert into categorias values (1,'Categoria 01');
insert into categorias values (2,'Categoria 02');
insert into categorias values (3,'Categoria 03');
insert into classes values (1,'Super-Lançamento', 7.00, 1);
insert into classes values (2,'Lançamento', 5.00, 2);
insert into classes values (3,'Ouro', 4.00, 3);
insert into classes values (4,'Prata', 3.00, 5);
insert into classes values (5,'Bronze', 2.00, 7);
insert into titulos values (1,3,5,'Titulo 01');
insert into titulos values (2,1,4,'Titulo 02');
insert into titulos values (3,2,3,'Titulo 03');
insert into titulos values (4,2,2,'Titulo 04');
insert into titulos values (5,1,1,'Titulo 05');
insert into funcionarios values (1,'Funcionario 01', '1111-1111', 'User 01','1234');
insert into locacao (id,funcionario,socio,data_2,hora,valortotal) values (1,1,1,24/06/2014,'12:36:36',10.00);
insert into locacao (funcionario,socio,dt_locacao,hora,valortotal) values (1,1,24/06/2014,'12:36:36',10.00);
insert into tipo_midias values (1,'DVD');
insert into tipo_midias values (2,'CD');
insert into distribuidores values (1,'Distribuidor 01', '11111111','Rua 01', '1111-1111', 'Joelma');
insert into midias values (1,1,1,2,0,10/10/2010, '1');
insert into midias values (2,2,1,3,0,10/10/2010, '2');
insert into midias values (3,2,1,1,0,10/10/2010, '3');
insert into midias values (4,1,1,2,0,10/10/2010, '4');