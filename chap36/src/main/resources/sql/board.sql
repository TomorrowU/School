Drop Table board;

CREATE TABLE board (
    bno      NUMBER(5)           NOT NULL CONSTRAINT BOARD_BNO_PK PRIMARY KEY,         
    subject  VARCHAR2(20 char)   NOT NULL,
    content  VARCHAR2(2000 char)         ,
    writer   VARCHAR2(10 char)   NOT NULL,
    reg_date date default sysdate
     );

insert into board 
    (bno , subject , content ,writer,reg_date)
    VALUES (
    1,'제목','내용','유옥천',SYSDATE
);


commit;