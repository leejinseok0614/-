package ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');
			char buff[] = { 'B', 'C', 'D', 'E', 'F', 'G' };

			fw.write(buff);
			fw.write("�ȳ��ϼ���.");
			fw.write(buff, 1, 2);
			fw.write("65");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
