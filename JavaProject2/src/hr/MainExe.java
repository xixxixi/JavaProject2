package hr;

import java.util.List;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
//		Employee[] empList = dao.empList();
//		List<Employee> empList = dao.getEmpList();
		Set<Employee> empList = dao.getEmps();
		System.out.println("salary�� 5000 �̻��� �������>> ");
		for (Employee emp : empList) {
			
			if(emp != null && emp.getSalary() > 5000) {
				System.out.println(emp.toString());
			}
		}
		dao = new EmpDAO();
		Department[] deptList = dao.deptList();
		System.out.println("location_id�� 1700�� ��� ����>> ");
		for(Department dep : deptList) {
			if(dep != null && dep.getLocation_id() == 1700) {
				System.out.println(dep.toString());
			}
		}
	}

}
