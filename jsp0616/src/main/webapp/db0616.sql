-- 테이블 만들기
create table member(
id varchar2(20) primary key,
pw VARCHAR2(20),
name varchar2(20),
phone VARCHAR2(20)
);

-- 실행: f9. 전체 실행: f5

-- 값 넣기
insert into member values(
'aaa','1111','홍길동','010-111-1111'
); 

insert into member values(
'bbb','1111','유관순','010-222-2222'
);

select * from member;

commit; --커밋해야 저장됨

--
create table member2(
id VARCHAR2(20) primary key,
pw VARCHAR2(20),
name VARCHAR2(20),
phone VARCHAR2(20)
);
-- 테이블 삭제
drop table member2;

-- 값 업데이트
update member set pw='2222' where id='bbb';
commit;

select * from member;






