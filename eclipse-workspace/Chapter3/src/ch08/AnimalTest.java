package ch08;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("������ �����Դϴ�.");
	}

	public void eating() {
		System.out.println("���� �Խ��ϴ�.");
	}
}

class Human extends Animal {

	public void move() {
		System.out.println("����� �����Դϴ�.");
	}

	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {

	public void move() {
		System.out.println("ȣ���̰� �� �߷� �����Դϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {

	public void move() {
		System.out.println("�������� ����ٴմϴ�.");
	}

	public void flying() {
		System.out.println("�������� �糯���� ��� ����ٴմϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hanimal = new Human();
		Animal tanimal = new Tiger();
		Animal eanimal = new Eagle();

		AnimalTest test = new AnimalTest();
///		test.moveAnimal(tanimal);
///		test.moveAnimal(hanimal); 
///		test.moveAnimal(eanimal);

		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hanimal);
		animalList.add(eanimal);
		animalList.add(tanimal);

		for (Animal animal : animalList) {
			animal.move();
		}

		test.testDownCasting(animalList);
	}

	public void testDownCasting(ArrayList<Animal> list) {

		for (int i = 0; i < list.size(); i++) {

			Animal animal = list.get(i);

			if (animal instanceof Human) {

				Human human = (Human) animal;
				human.readBook();
			}

			else if (animal instanceof Tiger) {

				Tiger tiger = (Tiger) animal;
				tiger.eating();
			}

			else if (animal instanceof Eagle) {

				Eagle eagle = (Eagle) animal;
				eagle.flying();
			} else {
				System.out.println("Non Supposed Type");
			}
		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();
		animal.eating();
	}
}
