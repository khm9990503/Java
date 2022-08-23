package ch07;

public class P207 {
	private String bookName;
	private String author;
	
	public P207() {}
	
	public P207(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
		
	}
	public String getbookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void showBookInfo() {
		System.out.println(bookName +","+author);
	}
	
}
