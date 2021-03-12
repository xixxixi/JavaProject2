package hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpDAO {
	Connection conn = null;

	EmpDAO() { // 생성자
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		conn = DBUtil.getConnection(url, user, passwd);
	}

	public Department[] deptList() {
		String sql = "select * from departments";
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Department[] departments = new Department[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Department dep = new Department();
				dep.setDepartment_id(rs.getInt("department_id"));
				dep.setDepartment_name(rs.getString("department_name"));
				dep.setLocation_id(rs.getInt("location_id"));
				dep.setManager_id(rs.getInt("manager_id"));
				departments[i++] = dep;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return departments;
	}

	public Set<Employee> getEmps() {
		Set<Employee> set = new HashSet<>();
		String sql = "select * from emp_java";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				set.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return set;
	}

	public List<Employee> getEmpList() {
		List<Employee> list = new ArrayList<>();
		String sql = "select * from emp_java";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return list;
	}

	public Employee[] empList() {
		String sql = "select * from emp_java";
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Employee[] employees = new Employee[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) { // next는 데이터가 있는 동안은 계속 true, 없으면 false.
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
//				System.out.println(emp.toString());
				employees[i++] = emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return employees;
	}

}
