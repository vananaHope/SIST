package backWeb.z01_vo;

public class Product {
	private String pname;
	private int price;
	private int count;
	private String prInfo;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, int price, int count, String prInfo) {
		this.pname = pname;
		this.price = price;
		this.count = count;
		this.prInfo = prInfo;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPrInfo() {
		return prInfo;
	}

	public void setPrInfo(String prInfo) {
		this.prInfo = prInfo;
	}
	
	
}
