insert into member values(
'fff','1111','ȫ���','010-6666-6666'
);

insert into member values(
'ggg','1111','ȫ����','010-7777-7777'
);

insert into member values(
'hhh','1111','������','010-8888-8888'
);

commit;

select * from member order by id desc;

select * from member where name like '%ȫ%';
select * from member where id='aaa' and pw='1111';

delete member where id='abc';
commit;
select * from member;

