package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add add = (x, y) -> {
			return x + y;
		};
		// Add add = (x,y) -> x+y;
		// ���ٽ� (Lamda expression)
		// ��ȯ���� �߰�ȣ ���� �Ұ���

		System.out.print(add.add(2, 3));
	}
}
