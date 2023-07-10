package javaexp.z01_home;

public class Woman {
	private int age;
	private String name;
	private String genderW;
	
	
	public Woman(String name, int age, String genderW) {
		this.name = name;
		this.age = age;
		this.genderW = genderW;
	}
	
	public void showWoman() {
		System.out.println(genderW+"의 이름: "+name);
		System.out.println(genderW+"의 나이: "+age);
	}
	
	public String getGenderW() {
		return genderW;
	}

	public void setGenderW(String genderW) {
		this.genderW = genderW;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
