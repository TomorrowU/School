DROP TABLE USERS;

CREATE TABLE USERS ( 
     ID         varchar2(20) CONSTRAINT USERS_ID_PK PRIMARY KEY NOT NUll,
     PASSWORD   VARCHAR2(100 char) NOT NULL,
     ROLE       VARCHAR2(20  char) DEFAULT 'USER'

);

insert into users values ('python', '$2a$10$sWir0UdE96tWUbNBvFE3ruoARN1Szx71SRijPp2zvJbAYD9507tO2', 'USER');
insert into users values ('java',   '$2a$10$vbxncCR/PRglzaoyWrJk4e/trm1k84nsDib8xcCXtIMWFKgvsHAgy', 'ADMIN');
commit;