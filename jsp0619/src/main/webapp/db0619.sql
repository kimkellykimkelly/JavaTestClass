create table board(
bno number(4) primary key,
id varchar2(20),
btitle varchar2(100),
bcontent VARCHAR2(2000),
bdate date default sysdate,
bhit number(4) default 0,
bgroup number(4),
bstep number(4),
bintent number(4),
bfile varchar2(100)
);

select board_seq.nextval from dual;

select board_seq.currval from dual;

insert into board values (
board_seq.nextval,'aaa','게시글등록1','게시글내용입니다.',sysdate,0,board_seq.CURRVAL,0,0,''
);

insert into board values (
board_seq.nextval,'aaa','게시글등록2','게시글내용입니다.2',sysdate,0,board_seq.CURRVAL,0,0,''
);

insert into board values (
board_seq.nextval,'aaa','이벤트등록','이벤트 진행하고 있습니다.',sysdate,0,board_seq.CURRVAL,0,0,''
);

insert into board values (
board_seq.nextval,'aaa','이벤트등록2','이벤트 진행하고 있습니다.2',sysdate,0,board_seq.CURRVAL,0,0,''
);

insert into board values (
board_seq.nextval,'aaa','공지사항 알림','홈페이지가 새롭게 오픈되었습니다.',sysdate,0,board_seq.CURRVAL,0,0,''
);

commit;

select * from board;