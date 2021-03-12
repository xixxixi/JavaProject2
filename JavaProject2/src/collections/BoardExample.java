package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Board {
	String subject;
	String content;
	String writer;

	Board() {
	} // 기본 생성자 반드시 생성

	Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "[subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
}

public class BoardExample {
	public static void main(String[] args) {
		List<Board> boards = new ArrayList<Board>();
//		boards = new LinkedList<>();

		Board b1 = new Board();
		b1.subject = "test";
		b1.content = "content";
		b1.writer = "user1";
		Board b2 = new Board("java", "very Good", "user2");
		Board b3 = new Board("jaVascript", "Good", "user1");

		boards.add(b1);
		boards.add(b2);
		boards.add(b3);
		boards.add(new Board("Javascript", "Good", "user1"));
		
		String searchStr = "java";
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).subject.substring(0, 4).toLowerCase().equals(searchStr)) {
				System.out.println(boards.get(i));
			}
		}
		
		
		
	}
}
