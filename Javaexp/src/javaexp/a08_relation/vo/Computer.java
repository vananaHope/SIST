package javaexp.a08_relation.vo;

public class Computer {
	private Ram ram;
	private Cpu cpu;
	private String comKind;
	// Ram
	public Computer(String comKind) {
		this.comKind = comKind;
	}
	
	public void addRam(Ram ram) {
		this.ram = ram;
		System.out.println(ram.getRamCompany()+" "+ram.getRamMem()+"GB 램을 추가합니다.");
	}
	
	//addRam() 램 장착.. 처리 메서드.
	
	// Computer com = new Computer("조립품");
	public void addCpu(Cpu cpu) {
		this.cpu = cpu;
		System.out.println(comKind+"에 "+cpu.getCompany()+" "+cpu.getSpec()+" cpu를 장착합니다.");
	}
	
	// com.showCom();
	
	// com.addCpu(new Cpu("AMD","6 Core 4.0GHz"));
	public void showCom() {
		System.out.println(comKind+" 컴퓨터!! 부품들!!");
		if(cpu==null) {
			System.out.println("cpu를 아직 장착하지 않습니다."); 
		}else {
			cpu.showInf();
		}
		if(ram==null) {
			System.out.println("RAM을 아직 장착하지 않았습니다.");
		}else {
			ram.showRam();
		}
		// ram 메모리 여부 확인해서 ram 정보 출력...
	}
	
	
}
