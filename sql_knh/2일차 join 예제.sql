-- 2021160123 학번 학생이 수강신청한 과목 제목을 확인하는 쿼리문

select co_st_num, su_title from course
	left join subject
	on course.co_su_num = subject.su_num
    where co_st_num = 2021160123;
select co_st_num, su_title from course
	left join subject
	on co_su_num = su_num
    where co_st_num = 2021160123;
-- 테이블 1과 2의 순서를 바꾸면 결과가 달라짐

-- 200160001 교수번호를 가진 교수님이 강의하는 강의 제목과 일정을 확인하는 쿼리문을 작성하세요

select su_title, su_schedule from lecture
	left join subject
	on le_su_num = su_num
	where le_pr_num = 200160001;

-- 컴퓨터 개론 강의하는 교수번호를 확인하는 쿼리문을 작성하세요
select le_pr_num from lecture
	left join subject
	on le_su_num = su_num
	where su_title='컴퓨터개론';
-- 컴퓨터 개론을 강의하는 교수님 이름을 확인하는 쿼리문 작성
select pr_name from lecture
	left join subject
	on le_su_num = su_num
    left join professor
    on pr_num = le_pr_num
	where su_title='컴퓨터개론';