package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A02_CompanyAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ex) 
		 상위 추상 클래스 Company 회사명, working() 공통메서드, earnMoney() 돈을 버는 방법, 추상
		 
		 하위 실제 클래스 HyunDae, Samsung
		 
		 */
		
		ArrayList<Company> clist = new ArrayList<Company>();
		clist.add(new HyunDae());
		clist.add(new Samsung());
		
		for(Company c:clist) {
			c.working();
			c.earnMoney();
		}
		
	}

}


abstract class Company {
	
	private String cName;
	
	public String getcName() {
		return cName;
	}

	public Company(String cName) {
		this.cName = cName;
	}
	
	public void working() {
		System.out.println(cName+" 일을 합니다.");
	}
	
	public abstract void earnMoney();
	
}

class HyunDae extends Company {

	public HyunDae() {
		super("현대");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void earnMoney() {
		System.out.println(getcName()+"는 선박을 건조해서 돈을 법니다.");
		
	}
	
}

class Samsung extends Company {

	public Samsung() {
		super("삼성");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void earnMoney() {
		// TODO Auto-generated method stub
		System.out.println(getcName()+"은 스마트폰을 팔아서 돈을 법니다.");
	}
	
}
