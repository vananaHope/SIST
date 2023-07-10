/*
 # 날짜 함수
 1. oracle의 날짜 데이터 타입(Date)는 날짜 + 시간을 포함하고 있다.
 
 2. oracle DB의 Date 타입의 시간과 날짜 처리 구조
 		1/1000초 ==> 1초 ==> 1분 ==> 1시간 ==> 1일* ==> 월 ==> 년
 		1일 ==> 월단위부터 규직적이지 않음 29,29,30,31
 		주의) 연산처리시 소숫점 이하에 대한 처리 
 		==> 함수(반올림,올림,내림) 중첩해서 처리해야 되는 경우가 많다.
 		
 3. 연산과 날짜 데이터
 	 1) 기본 연산
 	 	 날짜형 데이터 + 1 : 해당 날짜의 1일 이후(시간을 포함해서 24시간 이후)
 	 	 날짜형 데이터 - 1 : 해당 날짜의 -1일 이전
 	 	 날짜 + 1/24 : 해당 날짜의 1시간 이후(날짜+시간)
 	 	 날짜 + 200/60/24 : 해당 날짜의 200분 이후
 	 	 ex) 1일 기준으로 0.5 ==> 12시간		  
	 2) sysdate : 현재 날짜 + 시간
	 
	 date 유형은 날짜와 시간을 포함하는 개념이다.
	 	  
 */

SELECT sysdate, sysdate+1 하루후, sysdate-1 하루전,
		sysdate+5/24 "5시간이후", sysdate+30/60/24 "30분 이후" 
FROM dual;
-- 1일이 24시간이기에 시간 단위까지 계산하면 소숫점이하가 나타날 수 있다.
SELECT (sysdate +5/24) - SYSDATE 
FROM dual;
-- employees에서 현재일을 기준으로 근무일 수를 계산한다면 
SELECT first_name, HIRE_DATE , sysdate - hire_date "근무일수",
		floor(sysdate - hire_date) "근무한 수(절삭)",
		ceil(sysdate - HIRE_DATE)||'일차' "근무일차(올림)"
FROM EMPLOYEES e ;

/*
 ex) 사원명과 함께 인턴기간(입사후, 120일), 입사 8일전, 
 	 현재일 기준으로 근무일 수를 출력해보세요
 	 employee 테이블 기준
 	
 **/

SELECT ename, to_char(HIREDATE,'YYYY-MM-DD' ),to_char(hiredate+120,'YYYY-MM-DD') "인턴기간 마지막일", 
		hiredate-8 "입사 8일전", trunc(sysdate - hiredate,0) "근무일 수"
FROM emp;

/*
 # 월 데이터 처리 함수
 1. 날짜형 데이터는 월단위가 30/31/29 등 유동적이어서,
 	해당 월에 따라 함수로 이러한 월 계산 처리를 하고 있다.
 2. 기본 형식
 	1) 기본적으로 월 처리함수의 1은 1달을 의미한다.
 		그래서 1달의 반은 0.5가 된다.
 		이 내용도 월에 따라 28,29,30,31에 따라서 연산 결과 차이가 난다.
 	2) months_between(날짜1,날짜2) : 날짜 사이의 개월 수를 표시한다.
 		월에 대한 증가 카운트가 일단위가 가변적이기에 함수를 이용하는 것이 효율적이다.
 		
 				
 * */

SELECT ename, hiredate,
	months_between(sysdate, hiredate) "근무 개월수",
	floor(months_between(sysdate, hiredate)) "근무 개월수",
	ceil(months_between(sysdate, hiredate)) "근무 개월차"	
FROM emp;

-- 12로 나누면 근무 연한과 근무 연차를 계산
-- ceil, floor 중첩적으로 활용해서 처리할 수 있다.

-- ex1) dual을 이용해서 오늘로부터 1000일 이후, 개월 수를 출력하세요
	SELECT sysdate, sysdate+1000 "1000일 이후", FLOOR(months_between(sysdate, sysdate+1000))
	FROM dual;
-- ex2) emp테이블을 ename, hiredate를 이용해서
--		 @@년 @@개월 근무라고 출력해보세요
	SELECT ename, floor(MONTHS_BETWEEN(sysdate,HIREDATE)/12)||'년 '||
			MOD(floor(MONTHS_BETWEEN(sysdate,HIREDATE)),12)||'개월 근무'
	FROM emp;

-- ex) 오늘부터 근무하는 것을 기준으로 2000일 이후의 
-- 	  	근무연한과 개월 수를 출력하세요 @@년 @@개월 근무

SELECT sysdate, floor(MONTHS_BETWEEN(sysdate+2000,sysdate)/12)||'년 '||
		mod(floor(MONTHS_BETWEEN(sysdate+2000,sysdate)),12)||'개월 근무'
FROM dual;

/*
 # add_months를 통한 개월 수 추가
 1. 특정한 날짜를 기준으로 개월 수를 추가하여, 해당 이후 날짜를 처리하는데
 	사용된다.
 2. 형식
 	add_months(날짜, 추가 개월수/이전 개월수)
 		 
 
 * */
SELECT sysdate 오늘, ADD_MONTHS(sysdate,4) "4개월 후",
	ADD_MONTHS(sysdate, -1) "1개월 전" 
FROM dual;	

-- ex) 사원 정보를 기준으로 사원명, 입사일, 인턴기간(3개월),
--	입사10주년 기념일, 입사 20주년 기념일을 출력하세요

SELECT ename 사원명, hiredate 입사일, ADD_MONTHS(hiredate,3) "인턴 기간 만료일(3개월)",
		ADD_MONTHS(hiredate, 120) "입사10주년 기념일", ADD_MONTHS(hiredate, 240) "입사20주년 기념일"  
FROM emp;

/*
 # 다가올 가장 빠른 요일의 날짜 : next_day
 1. 해당 기준일로 명시된 요일에 가장 빠른 날짜
 2. 기본 형식
 	 next_day(날짜데이터, '요일')
 	
 **/
-- 오늘 이후 가장 빠른 수요일
SELECT next_day(sysdate,'수') "가장빠른 수요일"
FROM dual;

-- ex) 입사 후, 첫 주말(토요일) 날짜를 출력하세요
SELECT ename, hiredate, next_day(hiredate,'토')
FROM emp;

-- ex) 입사 후, 세 번째 되는 일요일의 날짜를 출력하세요
SELECT ename, hiredate, NEXT_DAY(NEXT_DAY(NEXT_DAY(HIREDATE,'일'),'일'),'일') "3번째 일요일" 
FROM emp;

/*
 # 매월의 마지막날을 가져오거나 첫 날을 가져올 때, 사용하는 함수
 last_day(날짜)
 1. 형식
 	last_day(기준일) : 해당 기준일에서의 월의 마지막 날짜
 	add_months(last_day(기준일)+1, -1) : 해당 월의 첫째 날짜
 	
 **/
 
SELECT last_day(sysdate) "이번달 마지막 날짜",
		last_day(sysdate)+1 "다음달의 첫 날",
		add_months(LAST_DAY(sysdate)+1,-1) "이번달의 첫날"
FROM dual;	

-- ex) 사원명과 급여일1(그달 종료일-10일전), 급여일2(다음달 10일)으로
-- 해당 사원의 첫 급여일 1,2을 출력해보세요

SELECT ename, hiredate, LAST_DAY(hiredate)-10 "급여일1",
		last_day(hiredate)+10 "보너스일"
FROM emp;		



