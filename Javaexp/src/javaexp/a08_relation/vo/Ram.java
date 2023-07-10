package javaexp.a08_relation.vo;

public class Ram {
	private String ramCompany;
	private int ramMem;
	
	
	public Ram(String ramCompany, int ramMem) {
		this.ramCompany = ramCompany;
		this.ramMem = ramMem;
	}
	
	public void showRam() {
		System.out.println("# 램 정보 #");
		System.out.println("제조사: "+ramCompany);
		System.out.println("메모리 용량: "+ramMem+"GB");
	}

	public String getRamCompany() {
		return ramCompany;
	}

	public void setRamCompany(String ramCompany) {
		this.ramCompany = ramCompany;
	}

	public int getRamMem() {
		return ramMem;
	}

	public void setRamMem(int ramMem) {
		this.ramMem = ramMem;
	}
	
	
}
