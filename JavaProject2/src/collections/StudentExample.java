package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(2, "김민수"), 85);
		map.put(new Student(1, "홍길동"), 92);	// key값은 중복이 안됨. 92로 업데이트 됨
		
		Set<Student> set = map.keySet();	// key값을 set 컬렉션에 담음
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()){
			Student student = iter.next();
			System.out.println(student.toString());	// 인스턴스 값이 다 다름
		}
	}

}
