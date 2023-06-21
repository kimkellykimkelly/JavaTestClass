select * from member where id='aaa' and pw='2222';

select * from member;

--테이블에 gender, hobby열 추가 (commit 필요없음)
alter table member add gender VARCHAR2(10);
alter table member add hobby VARCHAR2(50);

