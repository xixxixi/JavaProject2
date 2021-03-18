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
		// stream 중간처리 최종집계한 결과를 다시 List<String>
		Collector<Object, ?, List<Object>> col = Collectors.toList();

		List<String> newList = list.stream()// Stream<String>
				.filter(s -> s.startsWith("H"))// Stream<String>
				.collect(Collectors.toList()); // 필터링한 결과를 list, set, map 컬렉션에 담을 수 있음

		System.out.println("==============================================");
		EmpDAO dao = new EmpDAO();
//		dao.getEmpList(); // List<Employee> 리스트 타입의 컬렉션
		Set<Employee> emps = dao.getEmps(); // Set<Employee> 셋 타입의 컬렉션
		List<Employee> empList = emps.stream() // 직무가 IT_PROG 사람들을 가져와서 List<Employee>에 담기
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
