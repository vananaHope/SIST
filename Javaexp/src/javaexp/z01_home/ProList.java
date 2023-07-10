package javaexp.z01_home;

public class ProList {
	
	private String prodName;
	private int prodPrice;
	private int cnt;
	
	public ProList(String prodName, int prodPrice, int cnt) {
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.cnt = cnt;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
