-- 상품명
-- 종류
-- 가격
drop table if exists common_code;
create table common_code(
	id int primary key auto_increment,
    code varchar(50) not null,
    description varchar(255) not null,
    category varchar(50),
    status varchar(20)
);
insert into common_code(code,description,category,status)
values('001','딸기','fruit','');
insert into common_code(code,description,category,status)
values('002','사과','fruit','');
insert into common_code(code,description,category,status)
values('001','돼지고기','meat','');
insert into common_code(code,description,category,status)
values('002','소고기','meat','');

drop table if exists item;
create table item(
	id int primary key auto_increment,
    item_name varchar(100) not null,
    f_id int,
    foreign key(f_id) references common_code(id),
    price decimal(10,2) not null   
);

update item
set f_id = 3, item_name="돼지고기",price=100
where id = 2;



select * from item;
commit;
-- insert into item(item_name,f_id,price)
-- values('큐브 스태이크',4,25000);

delete from item where id = 


select description,id from common_code;
