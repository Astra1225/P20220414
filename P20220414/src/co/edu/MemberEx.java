package co.edu;

import java.util.Scanner;

public class MemberEx {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "사용자1", "010-2343-4534", 20);
//		m1.memberAge = -25;
		m1.setMemberAge(-25);
		m1.setMemberId("user01");
//		System.out.println("나이 " + m1.getMemberAge());
//		System.out.println("아이디 " + m1.getMemberId());
//		m1.showInfo();
		
		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[2];
		
		//사용자가
		
		for(int i=0; i<members.length; i++) {
			System.out.println("아이디 이름 연락처 나이 입력.");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			String strAge = scn.next();
			
			int age = Integer.parseInt(strAge);
			Member newMember = new Member(id, name, phone, age);
			
			members[i] = newMember;
		}
		
		for(Member member : members) {
			member.showInfo();
		}
		
		System.out.println("end of prog");
		
	}

}
