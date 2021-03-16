package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hong");
		list.add("Kim");
		list.add("Shin");

		list = Arrays.asList("Hong", "Kim", "Park"); // string 타입의 변수를 숫자 제한 없이 넣을 수 있음

		for (String str : list) {
			System.out.println(str);
		}
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);

		}

		Stream<String> stream = list.stream();
		stream.forEach((String t) -> {
			System.out.println(t);
		});

		stream = list.stream();
		stream.mapToInt(s -> s.length()).sum();

		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		Stream<Employee> eStream = empList.stream();

		// salary > 10000 이상인 사원, 사원들의 급여의 합계
		int sum2 = eStream.filter((t) -> t.getSalary() > 10000)//
				.mapToInt((t) -> t.getSalary())//
				.sum();
		System.out.println("급여가 10000이상인 사원들의 급여 합계: " + sum2);

		List<Integer> intList = Arrays.asList(10, 20);

	}

}
