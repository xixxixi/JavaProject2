package objects2;

public class Book {
	private String name;
	private String writer;
	private String pub;
	private int price;
	public Book(String name, String writer, String pub, int price) {
		this.name = name;
		this.writer = writer;
		this.pub = pub;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

