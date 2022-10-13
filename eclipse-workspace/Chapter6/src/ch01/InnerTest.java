package ch01;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	// �ν��Ͻ� ���� Ŭ����
	public OutClass() {
		inClass = new InClass();
	}

	/* private */ class InClass { // Private����� ���ο����� ��� ����!
		int iNum = 100;

		// static int sInNum = 500;�� ����� �� ����. ���� ������ InClass���ο��� ��� �Ұ���

		void inTest() {

			System.out.println("OutClass Num = " + num + " (�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + " (�ܺ� Ŭ������ Static ����)");
			System.out.println("InClass uNum = " + iNum + " (���� Ŭ������ �ν��Ͻ� ����)");
		}
	}

	public void usingClass() {
		inClass.inTest();
	}

	// ���� ���� Ŭ����
	static class InStaticClass {

		int iNum = 100;
		static int sInNum = 200;

		void inTest() {
			// ���� Ŭ���������� �ܺ� Ŭ������ �ν��Ͻ� ���� ��� �Ұ��� (�ܺο� ������� ���ɼ��� �ֱ� ����)
			// System.out.println("OutClass Num = " + num + " (�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("InClass uNum = " + iNum + " (���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + " (�ܺ� Ŭ������ Static ����)");
			System.out.println("InClass sInNum = " + sInNum + " (���� Ŭ������ Static ����)");
		}

		static void sTest() {
			// �������� �ʾ��� ���� �ֱ� ������ ���� Ŭ������ �ν��Ͻ� ���� ��� �Ұ���
			// System.out.println("InClass uNum = " + iNum + " (���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + " (�ܺ� Ŭ������ Static ����)");
			System.out.println("InClass sInNum = " + sInNum + " (���� Ŭ������ Static ����)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {

		/*
		 * OutClass outClass = new OutClass(); outClass.usingClass();
		 * 
		 * //���������δ� ���������� �� ������� �ʴ� ��� OutClass.InClass inner = outClass.new InClass();
		 * inner.inTest();
		 */

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
	}
}
