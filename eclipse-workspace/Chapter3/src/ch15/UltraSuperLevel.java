package ch15;

public class UltraSuperLevel extends PlayerLevel {

	public void run() {
		
		System.out.println("�ſ� ��û ������ �޸��ϴ�.");
	}

	@Override
	public void jump() {

		System.out.println("���� �ſ� ���� jump �մϴ�.");
	}

	@Override
	public void turn() {

		System.out.println("turn �� �� �մϴ�.");
	}

	@Override
	public void showLevelMessage() {

		System.out.println("****** ������ �����Դϴ�. ******");
	}
}
