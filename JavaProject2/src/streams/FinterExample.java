package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FinterExample {
	public static void main(String[] args) {
		List<Member> members = Arrays.asList(//
				new Member("È«±æµ¿", Member.MALE, 30), //
				new Member("±è³ª¸®", Member.FEMALE, 20), //
				new Member("½Å¿ë±Ç", Member.MALE, 45),//
				new Member("È«±æµ¿", Member.MALE, 36),//
				new Member("È«±æµ¿", Member.FEMALE, 30),//
				new Member("È«±æµ¿", Member.MALE, 30),//
				new Member("¹Ú¼ö¹Ì", Member.FEMALE, 27)//
		);
		
		members.stream().distinct().forEach(System.out::println);

	}

}
