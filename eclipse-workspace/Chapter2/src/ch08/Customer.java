package ch08;

public class Customer {

	public int customerNumber;
	public int phoneNumber;
	public String customerAddress;
	public int date;
	public int time;
	public int price;
	public int menuNumber;

	public Customer(int customerNumber, int phoneNumber, String customerAddress, int date, int time, int price,
			int menuNumber) {
		this.customerNumber = customerNumber;
		this.phoneNumber = phoneNumber;
		this.customerAddress = customerAddress;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNumber = menuNumber;
	}

	public String customerInfo() {
		return "�ֹ� ���� ��ȣ: " + customerNumber + "\n�ֹ� �ڵ��� ��ȣ: " + phoneNumber + "\n�ֹ��� �ּ�: " + customerAddress
				+ "\n�ֹ� ��¥: " + date + "\n�ֹ� �ð�: " + time + "\n����: " + price + "\n�޴���ȣ: " + menuNumber;
	}
}
