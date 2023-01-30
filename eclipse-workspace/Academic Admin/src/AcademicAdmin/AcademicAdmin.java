
package AcademicAdmin;

import java.util.Scanner;

public class AcademicAdmin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�л��� ���� �Է��ϼ���: ");
		int num = sc.nextInt();

		String student[][] = new String[num][5]; // [�л��Ǽ�][�����]

		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				student[i][j] = " ";
			}
		}

		while (true) {
			System.out.println("----------�޴�------------");
			System.out.println("1. �л� ���� �߰�");
			System.out.println("2. �л� ���� ����");
			System.out.println("3. �л� ���� �˻�");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ���");
			System.out.println("6. ������ ������ ���");
			System.out.println("-------------------------");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				insert(student);
				break;
			case 2:
				delete(student);
				break;
			case 3:
				search(student);
				break;
			case 4:
				update(student);
				break;
			case 5:
				print(student);
				break;
			case 6:
				math(student);
				break;
			}
		}
	}

	// �л� ���� �߰�
	static void insert(String student[][]) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < student.length; i++) {
			System.out.print("�̸�: ");
			String name = sc.next();

			System.out.print("����: ");
			String age = sc.next();

			System.out.print("����: ");
			String kor = sc.next();

			System.out.print("����: ");
			String eng = sc.next();

			System.out.print("����: ");
			String math = sc.next();

			student[i][0] = name;
			student[i][1] = age;
			student[i][2] = kor;
			student[i][3] = eng;
			student[i][4] = math;

			System.out.print("�Է¿Ϸ� \n");
		}
	}

	// �л� ���� ����
	static void delete(String student[][]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ ������ �̸��� �Է��ϼ���: ");
		String name = sc.next();

		int deleteIndex = -1;

		for (int i = 0; i < student.length; i++) {
			if (name.equals(student[i][0])) {
				deleteIndex = i;
				break;
			}
		}

		if (deleteIndex == -1) {
			System.out.println("������ �л��� �����Ͱ� �����ϴ�.");
		} else {
			for (int i = 0; i < student[deleteIndex].length; i++) {
				student[deleteIndex][i] = " ";
			}

			System.out.println("������ ������ �Ϸ��߽��ϴ�. \n");
		}
	}

	// �л� ���� �˻�
	static void search(String student[][]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�˻��� �л��� �̸�: ");
		String name = sc.next();

		int searchIndex = -1;

		for (int i = 0; i < student.length; i++) {
			if (name.equals(student[i][0])) {
				searchIndex = -1;
				break;
			}
		}

		if (searchIndex == -1) {
			System.out.println("�˻��� �̸��� �����Ͱ� �����ϴ�.");
		} else {
			for (int i = 0; i < student.length; i++) {
				if (student[i][0].equals("")) {
					for (i = 0; i < student.length; i++) {
						for (int j = 0; j < student.length; j++) {
							System.out.println("�˻��� �л��� ������ : " + student[i][j]);
						}
					}
				}

			}
		}
	}

	// �л� ���� ����
	static void update(String student[][]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �л��� �̸�: ");
		String name = sc.next();

		for (int i = 0; i < student.length; i++) {
			System.out.print("�̸�: ");
			String newName = sc.next();

			System.out.print("����: ");
			String newAge = sc.next();

			System.out.print("����: ");
			String newKor = sc.next();

			System.out.print("����: ");
			String newEng = sc.next();

			System.out.print("����: ");
			String newMath = sc.next();

			student[i][0] = newName;
			student[i][1] = newAge;
			student[i][2] = newKor;
			student[i][3] = newEng;
			student[i][4] = newMath;

			System.out.print("�Է¿Ϸ� \n");
		}
	}

	// �л� ���� ���
	static void print(String student[][]) {

		for (int i = 0; i < student.length; i++) {
			System.out.println("�̸�: " + student[i][0]);
			System.out.println("����: " + student[i][1]);
			System.out.println("���� ����: " + student[i][2]);
			System.out.println("���� ����: " + student[i][3]);
			System.out.println("���� ����: " + student[i][4]);
			System.out.println("��� �Ϸ� \n");
		}
	}

	// �л� ������ �հ� ���
	static void math(String student[][]) {
		Scanner sc = new Scanner(System.in);

		int sum = 0; //������ ��
		int avg = 0; //������ ���
		
		System.out.print("�̸��� �Է����ּ���: ");
		String name = sc.next();
		
		//String ������ ���� ������ int������ ����ȯ
		for(int i=0; i<student.length; i++) {
			sum = Integer.parseInt(student[i][2]) + Integer.parseInt(student[i][3]) + Integer.parseInt(student[i][4]);
			avg = sum / 3;
		}
		
		System.out.println(name + " �л��� ������ ������ " + sum + "�̰�, ����� " + avg + "�Դϴ�.");
	}
}
