-- ���̺� �����
create table member(
id varchar2(20) primary key,
pw VARCHAR2(20),
name varchar2(20),
phone VARCHAR2(20)
);

-- ����: f9. ��ü ����: f5

-- �� �ֱ�
insert into member values(
'aaa','1111','ȫ�浿','010-111-1111'
); 

insert into member values(
'bbb','1111','������','010-222-2222'
);

select * from member;

commit; --Ŀ���ؾ� �����

--
create table member2(
id VARCHAR2(20) primary key,
pw VARCHAR2(20),
name VARCHAR2(20),
phone VARCHAR2(20)
);
-- ���̺� ����
drop table member2;

-- �� ������Ʈ
update member set pw='2222' where id='bbb';
commit;

select * from member;






