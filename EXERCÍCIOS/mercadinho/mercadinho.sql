create database if not exists mercadinho
default character set utf8mb4
default collate utf8mb4_general_ci;
use mercadinho;

create table if not exists produto(
id int not null auto_increment,
descricao varchar(100),
qtd int,
preco real(5,2),
primary key(id)
)default charset utf8mb4;

select * from produto;
describe produto;
insert into produto (descricao,qtd,preco)values('arroz','4','12.50');