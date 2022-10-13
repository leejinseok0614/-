package ch20;

class MyThread extends Thread {
	// Thread�� ���� �����ؾ� �� �޼ҵ尡 �ݵ�� �ִ°� �ƴ�.
	// Thread�� ��ӹ޾Ƽ� ��� �޼ҵ� ����� �����ϴ�.

	public void run() {

		int i;

		for (i = 1; i <= 200; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + "Start"); // ���ν����� -> 1��
		MyThread th1 = new MyThread(); // Thread1 -> 2��
		MyThread th2 = new MyThread(); // Thread2 - > 3��

		th1.start();
		th2.start();
		System.out.println(Thread.currentThread() + "End");
	}
}
