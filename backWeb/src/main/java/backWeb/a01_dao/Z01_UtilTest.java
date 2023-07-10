package backWeb.a01_dao;

import java.util.List;

import com.google.gson.Gson;

import backWeb.z01_vo.Emp;
import backWeb.z01_vo.Person;

public class Z01_UtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		// 객체 ==> json 데이터로 변환
		Person p01 = new Person("홍길동",25,"서울");
		String jsonData = gson.toJson(p01);
		System.out.println(jsonData);
		
		A04_PreparedDao dao = new A04_PreparedDao();
		List<Emp> empList = dao.getEmpList();
		System.out.println(gson.toJson(empList));
		/*
		 * {"name":"홍길동","age":25,"loc":"서울"} DB 접속 성공
		 * {"empno":1000,"ename":"홍길동","job":"사원","mgr":7902,"hiredate":"5월 23, 2023"
		 * ,"sal":4000.0,"comm":1000.0,"deptno":10},
		 * {"empno":1002,"ename":"마길동","mgr":0,"hiredate":"6월 8, 2023","sal":3500.0,
		 * "comm":1000.0,"deptno":0},
		 * {"empno":7369,"ename":"오길동(upt)","job":"대리","mgr":7902,
		 * "hiredate":"6월 1, 2023","sal":5000.0,"comm":1000.0,"deptno":20},
		 * {"empno":7499,"ename":"ALLEN","job":"SALESMAN","mgr":7698,
		 * "hiredate":"6월 8, 2023","sal":3600.0,"comm":300.0,"deptno":30},
		 * {"empno":7521,"ename":"WARD","job":"SALESMAN","mgr":7698,
		 * "hiredate":"6월 8, 2023","sal":3250.0,"comm":500.0,"deptno":30},
		 * {"empno":7566,"ename":"JONES","job":"MANAGER","mgr":7839,
		 * "hiredate":"4월 2, 2021","sal":4975.0,"comm":1000.0,"deptno":20},
		 * {"empno":7654,"ename":"MARTIN","job":"SALESMAN","mgr":7698,
		 * "hiredate":"9월 28, 2021","sal":3250.0,"comm":1400.0,"deptno":30},
		 * {"empno":7698,"ename":"BLAKE","job":"MANAGER","mgr":7839,
		 * "hiredate":"5월 1, 2021","sal":4850.0,"comm":1000.0,"deptno":30},
		 * {"empno":7782,"ename":"CLARK","job":"MANAGER","mgr":7839,
		 * "hiredate":"6월 9, 2021","sal":4450.0,"comm":1000.0,"deptno":10},
		 * {"empno":7839,"ename":"KING","job":"PRESIDENT","mgr":0,
		 * "hiredate":"11월 17, 2021","sal":7000.0,"comm":1000.0,"deptno":10},
		 * {"empno":7844,"ename":"TURNER","job":"SALESMAN","mgr":7698,
		 * "hiredate":"9월 8, 2021","sal":3500.0,"comm":0.0,"deptno":30},
		 * {"empno":7900,"ename":"JAMES","job":"CLERK","mgr":7698,
		 * "hiredate":"12월 3, 2021","sal":2950.0,"comm":1000.0,"deptno":30},
		 * {"empno":7902,"ename":"FORD","job":"ANALYST","mgr":7566,
		 * "hiredate":"12월 3, 2021","sal":5000.0,"comm":1000.0,"deptno":20},
		 * {"empno":7934,"ename":"MILLER","job":"CLERK","mgr":7782,
		 * "hiredate":"6월 8, 2023","sal":1300.0,"comm":1000.0,"deptno":10}]
		 */
		
		
		
	}

}
