package ch02;

public class Student {

	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentName + "�л��� ��ȣ�� " + studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentNum == std.studentNum)
				return true;
			else
				return false;
		} 
		return false;
	}

	@Override
	public int hashCode() {

		return studentNum;
	}
}
