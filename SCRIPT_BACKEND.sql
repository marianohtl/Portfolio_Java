-- adicionar unique no e-mail
create database dbloginjsp;
use dbloginjsp;
create table tb_cliente(
idcli int primary key,
nome varchar(50) not null,
fone varchar(15) not null,
email varchar(100) not null,
senha varchar(20)
);

insert into tb_cliente values(3, 'Administrador','11111-1111', 'admin@admin.com', '123@senac');

insert into tb_cliente values(4, 'Bill Gates','11111-1111',	 'bill@outlook.com', '123@senac');

select * from tb_cliente;

update tb_cliente set nome = 'Jobs' where idcli = '2';
select * from tb_cliente where idcli='2';
