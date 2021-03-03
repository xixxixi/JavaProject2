package objects2;

public class Member {
	private String memName;
	private String memId;
	private Book[] rentBooks = new Book[5];
	public Member() {}

	public Member(String memId, String memName) {
		this.memId = memId;
		this.memName = memName;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getName().equals(book.getName())) {
				rentBooks[i] = null;
				break;
			}
		}
	}

	public String getBookInfo() {
		String result = "";
		result = memName;
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null) {
				result = result + "/" + rentBooks[i].getName();
			}

		}
		return result;
	}

}
