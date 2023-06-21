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
board_seq.nextval,'aaa','�Խñ۵��1','�Խñ۳����Դϴ�.',sysdate,0,board_seq.CURRVAL,0,0,''
);

insert into board values (
board_seq.nextval,'aaa','�Խñ۵��2','�Խñ۳����Դϴ�.2',sysdate,0,board_seq.CURRVAL,0,0,''
);

insert into board values (
board_seq.nextval,'aaa','�̺�Ʈ���','�̺�Ʈ �����ϰ� �ֽ��ϴ�.',sysdate,0,board_seq.CURRVAL,0,0,''
);

insert into board values (
board_seq.nextval,'aaa','�̺�Ʈ���2','�̺�Ʈ �����ϰ� �ֽ��ϴ�.2',sysdate,0,board_seq.CURRVAL,0,0,''
);

insert into board values (
board_seq.nextval,'aaa','�������� �˸�','Ȩ�������� ���Ӱ� ���µǾ����ϴ�.',sysdate,0,board_seq.CURRVAL,0,0,''
);

commit;

select * from board;