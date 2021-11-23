-- insert into student values('2021160123','hong','hong','홍길동','020101-3456789');
-- insert into student values('2021160124','hong123','pw123','황길동','020101-3123456');
-- insert into student(st_num, st_id, st_pw, st_name, st_reg_num)
-- values('2021116000','kang','kang','강감찬','021225-3654321');
-- insert into student(st_num, st_pw, st_id, st_name, st_reg_num)
-- values('2021116016','pwkim','kimid2','김영희','021225-4654324');
-- insert into student
-- values(2021123005, 'park', 'parkw', '박철수','021221-4443332'),
--   (2021456005, 'parkid','parkw','박수철','020000-3965641');



-- 교수번호가 200016001인 이순신 교수님의 정보를 추가하는 쿼리문을 작성하세요
-- id : lee, pw: leelee, 주민번호: 550505-1234567

-- 과목명이 컴퓨터개론이고, 과목코드는 MSC001, 일정과 분반은 미정인 과목을 추가하는 쿼리문 작성
-- insert into subject(su_num,su_code, su_title) values(1,'MSC001','컴퓨터개론');

-- 2000160001 교수님이 1번과목을 강의한다. 이 내용을 lecture 테이블에 추가하는 코드를 작성
-- insert into lecture (le_pr_num,le_su_num) values('20016001',1);


-- 2021160123 홍길동 학생이 1번 과목을 수강신청 했다. 이 내용을 추가하는 코드를 작성하세요.
-- insert into course(co_st_num,co_su_num) values(2021160123,1);

-- 200160001교수님이 1번과목을 강의할 강의 시간표가 새로 나왔다. 월1,2로 결정되었고, 분반은 3분반이다.
-- 다음을 실행하는 쿼리문을 작성하세요.
update subject set su_schedule = '월1, 월2', su_class_num = 3 
	where su_num = 1; 
SELECT * FROM subject;