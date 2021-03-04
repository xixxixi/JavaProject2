package objects2;

import java.util.Scanner;

public class Bankapplication {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				creatAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("���α׷� ����");
	}

	// ���� �����ϱ�
	private static void creatAccount() {
		System.out.println("---------");
		System.out.println("���»���");
		System.out.println("---------");

		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();

		Account1 account = new Account1(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}

	}

	// ���� ��Ϻ���
	private static void accountList() {
		System.out.println("---------");
		System.out.println("���¸��");
		System.out.println("---------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null)
				break;
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}

	// �����ϱ�
	private static void deposit() {
		System.out.println("---------");
		System.out.println("����");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int balance = scanner.nextInt();

		Account1 account = findAccount(ano);

		if (account == null) {
			System.out.println("���°� �������� �ʽ��ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}

	// ����ϱ�
	private static void withdraw() {

	}

	// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account1 findAccount(String ano) {
		Account1 account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}

		}
		return account;
	}
}
