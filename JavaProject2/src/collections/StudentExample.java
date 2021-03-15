package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "ȫ�浿"), 90);
		map.put(new Student(2, "��μ�"), 85);
		map.put(new Student(1, "ȫ�浿"), 92);	// key���� �ߺ��� �ȵ�. 92�� ������Ʈ ��
		
		Set<Student> set = map.keySet();	// key���� set �÷��ǿ� ����
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()){
			Student student = iter.next();
			System.out.println(student.toString());	// �ν��Ͻ� ���� �� �ٸ�
		}
	}

}
