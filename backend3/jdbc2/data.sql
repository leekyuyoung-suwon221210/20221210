use javadb;
insert into student(name,age,gender,grade,type)
 values('홍길동',12,0,1,1),
 ('김철수',12,0,1,1)
 ;
 
 
 select * from student
  ;
 

insert into subject(name,studentid,score)
 values('국어',2,80),
 ('영어',2,85),
 ('수학',2,95)
 ;

select
	*
    from student st join subject sb
		on st.id = sb.studentid        
        ;  

-- update
update student 
set name = '말자' 
where id = 2
;

-- delete
DELETE FROM student
WHERE id = 2
;

-- access deniy 발생했을때.... 비번을 다시 설정하거나. 또는 편집창에서 
-- Access denied for user '유저아이디'@'localhost' (using password: YES)

-- create user '계정명'@'%' identified by 'password';
-- grant all privileges on *.* to '계정명'@'%';
-- flush privileges;        