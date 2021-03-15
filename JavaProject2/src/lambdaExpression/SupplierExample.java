package lambdaExpression;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

import hr.EmpDAO;
import hr.Employee;

class Member {
	String name;
	int score;

	Member(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class SupplierExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Supplier<Member> sup = () -> {
			int cnt = 0, maxScore = 0;
			String maxName = null;
			while (true) {
				System.out.print("�̸��Է�: ");
				String name = scn.nextLine();
				System.out.print("�����Է�: ");
				int score = scn.nextInt();
				scn.nextLine();
				if (maxScore < score) {
					maxScore = score;
					maxName = name;
				}
				if (cnt++ == 2) {
					break;
				}
			}
			return new Member(maxName, maxScore);
		};
		Member m1 = sup.get();
		System.out.println(m1.name + ", " + m1.score);

		DoubleSupplier ds = () -> {
			EmpDAO dao = new EmpDAO();
			Set<Employee> set = dao.getEmps();
			Iterator<Employee> iter = set.iterator();
			int sum = 0;
			int cnt = 0;
			while (iter.hasNext()) {
				Employee emp = iter.next();
				sum += emp.getSalary();
				cnt++;
			}
			return (double) sum / cnt;
		};
		double avg = ds.getAsDouble();
		System.out.println("�޿����: " + avg);

		IntSupplier intSupplier = () -> { // ���ٽ�
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};

		int num = intSupplier.getAsInt(); // .getAsint = int ���� ����
		System.out.println("���� ��: " + num);
	}

}
