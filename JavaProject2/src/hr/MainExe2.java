package hr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainExe2 {
	public static void main(String[] args) {
		// ���� �޿�����
		EmpDAO dao = new EmpDAO();
		Set<Employee> set = dao.getEmps();	// ��ü����Ʈ Set ����

		TreeSet<Employee> tset = new TreeSet<Employee>(); // salary ����

		Iterator<Employee> iter = set.iterator();
		while (iter.hasNext()) {
			tset.add(iter.next()); // salary ���� �Ǹ鼭 ����
		}
		iter = tset.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());	// salary ���
		}
		
	}
}
