package javaexp.z01_home;

public class MemList {
	private String memId;
	private String passwd;
	private String memName;
	private int memPoint;
	private String memGrade;
	public MemList(String memId, String passwd, String memName, int memPoint, String memGrade) {
		this.memId = memId;
		this.passwd = passwd;
		this.memName = memName;
		this.memPoint = memPoint;
		this.memGrade = memGrade;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public int getMemPoint() {
		return memPoint;
	}
	public void setMemPoint(int memPoint) {
		this.memPoint = memPoint;
	}
	public String getMemGrade() {
		return memGrade;
	}
	public void setMemGrade(String memGrade) {
		this.memGrade = memGrade;
	}
}
