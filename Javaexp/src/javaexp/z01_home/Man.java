package javaexp.z01_home;

public class Man {
	private Woman woman;
	private String mName;
	private int mAge;
	private String genderM;
	
	public Man(String mName, int mAge, String genderM) {
		this.mName = mName;
		this.mAge = mAge;
		this.genderM = genderM;
	}
	
	public void showMan() {
		System.out.println(genderM+"의 이름: "+mName);
		System.out.println(genderM+"의 나이: "+mAge);
	}
	
	
	public void addWoman(Woman woman) {
		this.woman = woman;
		System.out.println("커플 매칭 여성의 이름: "+woman.getName()+" 커플 매칭 여성의 나이: "+woman.getAge());
	}
	
	public void showCouple() {
		if(woman.getGenderW().equals(genderM)||woman.getAge()-mAge>15||mAge-woman.getAge()>15
				||woman.getAge()<20||mAge<20) {
			System.out.println("커플 매칭에 문제가 있습니다");
		}else {
			System.out.println("커플 매칭에 성공했습니다.");
		}
	}
	
	
}
