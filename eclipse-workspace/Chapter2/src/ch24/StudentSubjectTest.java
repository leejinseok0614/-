package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");

		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 100);

		Student studentKim = new Student(1001, "Kim");

		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 80);

		studentLee.showScoreInfo();
		System.out.println("=============");
		studentKim.showScoreInfo();
	}
}
