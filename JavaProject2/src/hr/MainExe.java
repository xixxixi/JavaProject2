package hr;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		
		Map<String, String> map = dao.getJobList();
//		Set<Entry<String, String>> set = map.entrySet();
//		Iterator<Entry<String, String>> iter = set.iterator();
//		while(iter.hasNext()) {
//			Entry<String, String> ent = iter.next();
//			System.out.println("Job_id: "+ ent.getKey() + ", jobTitle: " + ent.getValue());
//		
//		}
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String val = map.get(key);
			
			System.out.println("job_id: " + key + ", jobTitle: " + val);
		}
		
		
//		Employee[] empList = dao.empList();
//		List<Employee> empList = dao.getEmpList();
//		Set<Employee> empList = dao.getEmps();
//		System.out.println("salary가 5000 이상인 사원정보>> ");
//		for (Employee emp : empList) {
//			
//			if(emp != null && emp.getSalary() > 5000) {
//				System.out.println(emp.toString());
//			}
//		}
//		dao = new EmpDAO();
//		Department[] deptList = dao.deptList();
//		System.out.println("location_id가 1700인 사원 정보>> ");
//		for(Department dep : deptList) {
//			if(dep != null && dep.getLocation_id() == 1700) {
//				System.out.println(dep.toString());
//			}
//		}
	}

}
