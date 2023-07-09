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

drop table if exists member;
create table member(
	email varchar(20),
    user_name varchar(20) not null,
    user_psw varchar(20) not null,
    primary key(email)
);


insert into member(email,user_name,user_psw) values('test@test.com','test','test');

select * from member where email = 'test@test.com';



