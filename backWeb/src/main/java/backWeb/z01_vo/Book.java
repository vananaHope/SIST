package backWeb.z01_vo;

public class Book {
	private String bookName;
	private int bookYear;
	private String bookCom;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, int bookYear, String bookCom) {
		this.bookName = bookName;
		this.bookYear = bookYear;
		this.bookCom = bookCom;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookYear() {
		return bookYear;
	}

	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}

	public String getBookCom() {
		return bookCom;
	}

	public void setBookCom(String bookCom) {
		this.bookCom = bookCom;
	}
	
	
}
