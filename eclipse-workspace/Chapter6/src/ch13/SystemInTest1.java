package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

//����� ��Ʈ��

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("���ĺ� �������� ���� [Enter]�� ��������. ");

		int i;

		try {
			InputStreamReader irs = new InputStreamReader(System.in); // ����Ʈ ������ ��� ����
			while ((i = irs.read()) != '\n') {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
