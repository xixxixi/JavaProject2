package api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("api.Car");

		System.out.println("[Ŭ���� �̸�]");
		System.out.println(clazz.getName());
		System.out.println();

		System.out.println("[������ ����]");
		Constructor[] constructors = clazz.getDeclaredConstructors(); // ������ �̸��� �Ű� ���� ������ ���
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

		System.out.println();

		System.out.println("[�ʵ� ����]");
		Field[] fields = clazz.getDeclaredFields(); // �ʵ� Ÿ�԰� �ʵ� �̸��� ���
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();

		System.out.println("[�޼ҵ� ����]");
		Method[] methods = clazz.getDeclaredMethods();	// �޼ҵ� �̸��� �Ű� ������ ���
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

	}

	private static void printParameters(Class[] parameters) {	// �Ű� ���� ������ ����ϴ� ���� �ڵ�
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length - 1)) {
				System.out.print(",");
			}
		}

	}
}