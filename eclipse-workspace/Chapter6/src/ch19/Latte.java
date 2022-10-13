package ch19;

public class Latte extends Decorator {
	// ���� Ŭ������ default costructor�� �����Ƿ� �ݵ�� super���.

	public Latte(Coffee coffee) {
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.println("Adding Milk");
	}
}
