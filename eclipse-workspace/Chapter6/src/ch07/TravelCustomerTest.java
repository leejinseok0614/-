package ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer cutomerLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer cutomerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer cutomerHong = new TravelCustomer("ȫ�浿", 13, 50);

		List<TravelCustomer> customerlist = new ArrayList<>();
		customerlist.add(cutomerLee);
		customerlist.add(cutomerKim);
		customerlist.add(cutomerHong);

		System.out.println("== �� ��� �߰��� ������� ��� ==");
		customerlist.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

		System.out.println("\n== ���� ��� ==");
		int total = customerlist.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("�� ���� ����� :" + total + "�Դϴ�");

		System.out.println("\n== 20�� �̻� �� ��� �����Ͽ� ��� ==");
		customerlist.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));
	}
}
