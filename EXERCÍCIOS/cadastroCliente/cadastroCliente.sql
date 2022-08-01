create database if not exists cadastroCliente
default character set utf8mb4
default collate utf8mb4_general_ci;
use cadastroCliente;

create table if not exists cliente(
id int not null auto_increment,
nome varchar(100) not null,
cpf varchar(20) not null unique,
celular varchar(20) not null,
sexo char(1) not null,
senha varchar(20) not null,
primary key(id)
)default charset utf8mb4;
drop table cliente;
describe cliente;
select * from cliente;
insert into cliente (nome,cpf,celular,sexo,senha) values('lucas','108.872.504.08','987874721','M','123456');
delete from cliente where id = 1; 