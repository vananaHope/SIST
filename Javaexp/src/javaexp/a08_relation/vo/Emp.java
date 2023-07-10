package javaexp.a08_relation.vo;

public class Emp {
	private int empo;
	private String ename;
	private String job;
	private double sal;
	private int deptno;
	public Emp() {
		
	}
	public Emp(int empo, String ename, String job, double sal, int deptno) {
		this.empo = empo;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.deptno = deptno;
	}
	public int getEmpo() {
		return empo;
	}
	public void setEmpo(int empo) {
		this.empo = empo;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
}
