package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class ToListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hong", "Hwang", "Park");
		// stream �߰�ó�� ���������� ����� �ٽ� List<String>
		Collector<Object, ?, List<Object>> col = Collectors.toList();

		List<String> newList = list.stream()// Stream<String>
				.filter(s -> s.startsWith("H"))// Stream<String>
				.collect(Collectors.toList()); // ���͸��� ����� list, set, map �÷��ǿ� ���� �� ����

		System.out.println("==============================================");
		EmpDAO dao = new EmpDAO();
//		dao.getEmpList(); // List<Employee> ����Ʈ Ÿ���� �÷���
		Set<Employee> emps = dao.getEmps(); // Set<Employee> �� Ÿ���� �÷���
		List<Employee> empList = emps.stream() // ������ IT_PROG ������� �����ͼ� List<Employee>�� ���
				.filter(new Predicate<Employee>() {
					@Override
					public boolean test(Employee t) {
						return t.getJobId().equals("IT_PROG");
					}
				}) // Stream<Employee>
				.collect(Collectors.toList());
				

		empList.stream().forEach(s -> System.out.println(s));

//		for (String str : newList) {
//			System.out.println(str);
//		}
	}

}
