/*
 오전 복습 문제 입니다.
1. `nvl` 함수는 어떤 데이터 처리에 효과적으로 사용될 수 있습니까?
    a) Null값일 때의 에러 처리
    b) String 데이터의 변환
    c) 데이터의 정렬
    d) 데이터베이스 연결 관리

a

DB에서 NULL을 처리해주지 않으면, 실제 화면에서도 NULL이라고 문자열의 경우 표시된다.
NULL ==> "", NULL ==> 0 default 처리
nvl(컬럼,null일때)


2. `nvl2` 함수는 어떤 경우에 유용하게 사용될 수 있습니까?
    a) Null값이 아닐 때와 Null일 때를 구분하여 처리할 경우
    b) 데이터 정렬에 필요한 경우
    c) 데이터 타입을 변환할 경우
    d) 데이터를 저장할 경우

a

nvl2(컬럼, null이 아닐 때, null일 때)


3. `nullif` 함수는 무엇을 반환하나요?
    a) 두 데이터가 동일하면 첫 번째 데이터를 반환
    b) 두 데이터가 동일하면 null을 반환
    c) 두 데이터가 동일하지 않으면 null을 반환
    d) 두 데이터가 동일하지 않으면 첫 번째 데이터를 반환

b, d

nullif(데이터1, 데이터2)
동일한 경우 null
동일하지 않을 때는 데이터1

4. `decode` 함수는 어떤 언어의 어떤 기능과 비슷한가요?
    a) Python의 for loop
    b) Java의 switch-case 문
    c) JavaScript의 forEach 함수
    d) C++의 while loop

b

decode(컬럼/데이터, 
			case1, case1경우 데이터
			case2, case2경우 데이터
			case3, case3경우 데이터
			그외 경우
		)

5. `case` 함수는 무엇을 확장한 형태인가요?
    a) nvl 함수
    b) nullif 함수
    c) decode 함수
    d) extract 함수

c

case1
	case 
		when 조건문1 then 처리데이터
		when 조건문2 then 처리데이터
		when 조건문3 then 처리데이터
		else 조건이외 처리 데이터
		end 별칭

case2
	case 컬럼 or 데이터
		when 케이스1 then 처리데이터
		when 케이스2 then 처리데이터
		when 케이스3 then 처리데이터
		else 위 케이스 이외 처리데이터

6. `sign` 함수는 어떤 값을 반환하나요?
    a) 양수인 경우 1, 음수인 경우 -1, 0인 경우 0
    b) 양수인 경우 1, 음수인 경우 0
    c) 양수인 경우 0, 음수인 경우 -1
    d) 양수인 경우 0, 음수인 경우 1

a

sign은 decode 함수와 함께 중첩함수로 case에서 범위를 지정하지 못하는 부분에 대하여
보완을 할 때 사용한다.
소숫점 이하가 나오더라도 양수인 경우 1
소숫점 이하가 나오더라도 음수인 경우 -1
0인 경우 0

7. `extract` 함수는 어떤 데이터로부터 무엇을 추출하나요?
    a) 날짜 데이터로부터 연도, 월, 일을 추출
    b) 문자열 데이터로부터 특정 문자를 추출
    c) 숫자 데이터로부터 소수점을 추출
    d) 배열 데이터로부터 특정 요소를 추출

a

tochar(날짜,'형식') : 문자열 데이터 연산처리가 
	필요할 때는 형변환이나 자동변환을 활용
	
extract(형식 from 컬럼명) : 숫자형 데이터 처리
	YYYY,MONTH,DAY

8. `decode` 함수와 `sign` 함수를 함께 사용하면 어떤 효과가 있나요?
    a) 데이터 정렬에 유용하다
    b) 여러 조건에 따라 데이터를 다르게 처리할 수 있다
    c) 데이터 타입을 변환할 수 있다
    d) 데이터베이스 연결을 관리할 수 있다
 
b    

decode 한계점이 정확한 case에 대한 처리는,
boolean 형식으로 범위를 지정하여 처리할 때,
sign() 중첩하면 효과적으로 처리할 수 있다.          
                              
9. case 함수는 어떤 연산을 통해 비교가 가능하게 해주는가?
   a) 산술 연산만 가능
   b) 관계 연산만 가능
   c) 논리 연산만 가능
   d) 산술, 관계, 논리 연산 모두 가능
	
d

비교를 처리해주는 연산식에 사용하는 연산자 사용이 모두 가능하다.
산출, 관계, 논리연산

10. sign 함수는 어떤 값을 반환하는가?
   a) n < 0 : -1, n = 0 : 0, n > 0 : 0
   b) n < 0 : 0, n = 0 : 1, n > 0 : 1
   c) n < 0 : -1, n = 0 : 0, n > 0 : 1
   d) n < 0 : -1, n = 0 : -1, n > 0 : 1

c



*/
/*
문제 1:
사원들의 보너스를 계산하려 합니다. 보너스는 comm 값에 10%를 더한 값입니다. 만약 comm이 null인 경우에는 sal의 20%로 보너스를 설정하고, 이 보너스의 합산 금액을 출력하시오.
(문제에서는 nvl 함수를 활용해야 합니다.)
*/

SELECT ename, comm, nvl(comm*1.1, sal*0.2) 보너스
FROM emp;


/*
문제 2:
각 사원의 보너스를 계산하되, 만약 comm 값이 null이면 sal의 15%로, null이 아니라면 comm 값에 sal의 5%를 더하여 보너스를 계산하려 합니다. 10단위로 절삭한 보너스 금액을 출력하시오.
(문제에서는 nvl2 함수를 활용해야 합니다.)
*/

SELECT ename, nvl2(comm, trunc(comm+sal*0.05,-1), trunc(comm+sal*0.15,-1)) 보너스
FROM emp;

/*
문제 3:
모든 사원의 보너스를 계산하려 합니다. 만약 comm이 0인 경우에는 null을 반환하고, 그렇지 않으면 comm을 그대로 출력하시오. 각 사원의 사원명, 급여, 보너스를 출력하시오.
(문제에서는 nullif 함수를 활용해야 합니다.)
*/

SELECT ename, sal, nullif(comm,0) 보너스
FROM emp;

/*
문제 4:
각 사원에 대한 급여 등급을 부여하려 합니다. 5000 이상의 급여를 받는 사원은 'A' 등급, 3000 ~ 4999는 'B' 등급, 2000 ~ 2999는 'C' 등급, 그 외는 'D' 등급을 부여하려 합니다. 각 사원의 이름과 급여 등급을 출력하시오.
(문제에서는 CASE WHEN 구문을 활용해야 합니다.)
*/

SELECT ename, sal,
	CASE WHEN sal>= 5000 THEN 'A'
		 WHEN SAL>=3000 AND SAL < 5000 THEN 'B'
		 WHEN SAL>=2000 AND SAL < 3000 THEN 'C'
		 ELSE 'D'
	END "급여 등급"
 FROM EMP;
/*
문제 5:
사원들의 입사일이 1982년 이후인지 여부를 확인하려 합니다. 1982년 이후에 입사한 사원의 경우 'Y', 그렇지 않은 경우 'N'으로 출력하시오.
(문제에서는 extract와 decode 함수를 활용해야 합니다.) 
 */

SELECT ename, hiredate, decode(SIGN(EXTRACT(YEAR FROM hiredate)-1982),-1,'N','Y') "1982년 이후"
FROM EMP;


