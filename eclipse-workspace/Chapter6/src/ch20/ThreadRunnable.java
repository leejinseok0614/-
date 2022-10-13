package ch20;

class MyRunnable implements Runnable {
	// Runnalbe�� ��쿡�� Start�� �ٷ� �Ұ��� (Start�� Thread�� �޼ҵ�)

	public void run() {

		int i;

		for (i = 1; i <= 200; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadRunnable {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + "Start"); // ���ν����� -> 1��

		MyRunnable runnable = new MyRunnable();

		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);

		th1.start();
		th2.start();

		System.out.println(Thread.currentThread() + "End");
	}
}
