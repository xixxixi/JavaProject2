package objects2;

public class LibaryExe {

	public static void main(String[] args) {
		Book book1 = new Book("�ڹ�", "����1", "���ǻ�1", 1000);
		Book book2 = new Book("HTML", "����2", "���ǻ�2", 2000);
		Book book3 = new Book("CSS", "����3", "���ǻ�3", 3000);
		Book book4 = new Book("�ڹٽ�ũ��Ʈ", "����4", "���ǻ�4", 4000);
		
		Member mem1 = new Member("s111", "��ȿ��");
		mem1.rent(book1);
		mem1.rent(book2);
		mem1.overdue(book2);
		System.out.println(mem1.getBookInfo());
		
		Member mem2 = new Member("a222", "���Ѽ�");
		mem2.rent(book3);
		mem2.rent(book4);
		System.out.println(mem2.getBookInfo());	
		
		
	}

}
