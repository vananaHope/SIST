package backWeb.z01_vo;

import java.util.Date;

public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private String hiredateS;
	private Double sal;
	private Double comm;
	private int deptno;
	
	public Emp() {
		
	}


	public Emp(int empno, String ename, String job, Date hiredate, Double sal) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
	}


	// 검색시 필요한 ENAME, JOB
	public Emp(String ename, String job) {
		this.ename = ename;
		this.job = job;
	}
	/*
UPDATE EMP02 
	SET ename = '오길동(upt)',
		job = '대리',
		sal = 5000,
		HIREDATE = TO_DATE('2023/06/01','YYYY/MM/DD') 
	WHERE empno = 7369
	Emp(7499,"오길동(upt)","대리","2023/06/01",5000.0)
	 * */
	public Emp(int empno, String ename, String job, String hiredateS, Double sal) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredateS = hiredateS;
		this.sal = sal;
	}
	public Emp(int empno, String ename, String job, int mgr, String hiredateS, Double sal, Double comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredateS = hiredateS;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	public Emp(int empno, String ename, String job, int mgr, Date hiredate, Double sal, Double comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getHiredateS() {
		return hiredateS;
	}
	public void setHiredateS(String hiredateS) {
		this.hiredateS = hiredateS;
	}
	
	
	
}
