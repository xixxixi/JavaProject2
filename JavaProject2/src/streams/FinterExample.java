package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FinterExample {
	public static void main(String[] args) {
		List<Member> members = Arrays.asList(//
				new Member("ȫ�浿", Member.MALE, 30), //
				new Member("�質��", Member.FEMALE, 20), //
				new Member("�ſ��", Member.MALE, 45),//
				new Member("ȫ�浿", Member.MALE, 36),//
				new Member("ȫ�浿", Member.FEMALE, 30),//
				new Member("ȫ�浿", Member.MALE, 30),//
				new Member("�ڼ���", Member.FEMALE, 27)//
		);
		
		members.stream().distinct().forEach(System.out::println);

	}

}
