create table customers(
                          id bigserial primary key,
                          last_name varchar(64) not null,
                          first_name varchar(64) not null ,
                          patronymic varchar(64) not null ,
                          date_of_birth timestamp not null unique ,
                          place_of_birth varchar(64),
                          mail varchar not null,
                          social_networks varchar(64) not null,
                          telephone varchar(64) not null

);
drop table customers;
drop table topics_covered;

create table  topics_covered (
                                 id bigserial primary key ,
                                 name_themes varchar(255) not null unique ,
                                 client_id bigint references customers (id)
);
insert into customers (last_name, first_name, patronymic, date_of_birth, place_of_birth, mail, social_networks, telephone)
VALUES ('Aleks','Sorokin','Andreevich','24.09.1988,17:05','Simferopol','ktyz5@rambler.ru','VK','80502667767');

insert into topics_covered (name_themes,client_id)  values ('Garri Potter', 1);

select * from customers;
select *from customers inner join topics_covered tc on customers.id = tc.client_id
where tc.client_id=1;
delete from topics_covered where id =2;