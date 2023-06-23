drop table boardComment;

Drop SEQUENCE boardComment_seq;

CREATE SEQUENCE boardComment_seq
       INCREMENT BY 1
       START WITH 1
       MINVALUE 1
       MAXVALUE 9999
       NOCYCLE
       NOCACHE
       NOORDER;

create table boardComment(
  cno NuMBER not null  primary key, 
  bno NUMBER not null,    
  content VARCHAR2(400) not null, 
  writer varchar(20) not null, 
  regDate TimeSTAMP(0) default sysdate not null);  
  
insert into boardComment (cno,bno,content,writer) VALUES (
boardComment_seq.NEXTVAL,1,'ㅎㅎ','반가워');  
  
commit;