package ch01;

class Outer2 {

	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) { // Ŭ������ Threadȭ�� �������̽� // ���ø޸𸮿� �����.

		int num = 400;

		return new Runnable() { // ����Ŭ����

			int localNum = 500;

			@Override
			public void run() {

				// i = 50;
				// num = 20;
				// ������ ���� ������, �޼ҵ� ȣ��� ���� ������ �ٸ��� �����̴�.
				// final�� ó���� �Ǿ �ܺ� ���������� �޼ҵ� ȣ���� ������ ������� �ʰ�, ��� �޸𸮿� ���� ����.

				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("LocalNum = " + localNum);

				System.out.println("OutNum = " + outNum + " (�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer2.sNum + " (�ܺ� Ŭ���� ���� ����)");
			}
		};
	}

	Runnable runnable = new Runnable() {

		@Override
		public void run() {

			System.out.println("Runnable class");
		}
	};
}

public class AnonumousInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);

		runner.run(); // ȣ���� ���ؼ� ���ÿ� ���� ���� ��� �޸𸮿� ���� �����ؾ� ��.

		out.runnable.run();
	}

}
