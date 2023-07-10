package javaexp.a08_relation.vo;

public class Music {
	// 필드는 접근 제어자를 private 선언 ( 직접 접근이 안되고 간접접근 처리 )
	private String mname;
	private String singer;
	private int year;
	// 생성자나 메서드의 접근 제어자는 public
	public Music(String mname, String singer, int year) {
		this.mname = mname;
		this.singer = singer;
		this.year = year;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
