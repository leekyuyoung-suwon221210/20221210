use javadb;
drop table if exists student;
drop table if exists subject;

CREATE TABLE student (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL COMMENT '''이름''',
  age int NOT NULL COMMENT '''나이''',
  gender int NOT NULL COMMENT '''성별(남:0, 여:1)''',
  grade int NOT NULL COMMENT '''학년''',
  type int NOT NULL COMMENT '''type:1 초, 2:중, 3:고''',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
;

CREATE TABLE subject (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  studentid int NOT NULL,
  score varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
;