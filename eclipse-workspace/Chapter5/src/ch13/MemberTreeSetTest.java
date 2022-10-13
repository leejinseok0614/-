package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		/*
		TreeSet<String> set = new TreeSet<String> ();
		
		set.add("ȫ�浿");
		set.add("������");
		set.add("������");
		set.add("�����");
		
		System.out.println(set);
		*/
		
		MemberTreeSet memberHashSet = new MemberTreeSet();

		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.showAllMember();

		Member memberHong = new Member(1003, "ȫ�浿"); // 1003 ���̵� �ߺ�
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
	}

}
