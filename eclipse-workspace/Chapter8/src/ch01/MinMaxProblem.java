package ch01;

//���� ���� ���� �迭�� ���� �� �� �� ���� ū ���� ���� ���� ���� ã�´�.
//�迭�� �� ��°�� �ִ��� ������ ã�´�.
//�ݺ����� �ѹ��� ����Ͽ� ������ �ذ��Ѵ�.
//���� �� : [10, 55, 23, 2, 79, 101, 16, 82, 30, 45]

public class MinMaxProblem {

	public static void main(String[] args) {

		int[] numbers = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };

		int min = numbers[0]; // ���� ū ��
		int max = numbers[0]; // ���� ���� ��
		int minpos = 0; // ū ���� ��ġ
		int maxpos = 0; // ���� ���� ��ġ

		for (int i = 0; i < numbers.length; i++) {

			if (min > numbers[i]) {
				min = numbers[i];
				minpos = i + 1;
			}

			if (max < numbers[i]) {
				max = numbers[i];
				maxpos = i + 1;
			}
		}

		System.out.println("���� ū ���� " + max + "�̰�, ��ġ�� " + maxpos);
		System.out.println("���� ���� ���� " + min + "�̰�, ��ġ�� " + minpos);
	}
}
