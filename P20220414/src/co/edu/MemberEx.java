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
		
		//사용자입력
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
		
		//1. 조회(이름), 2. 변경(아이디, 연락처), 3. 조회(나이 큰 회원) 4. 종료
		while (true) {
			System.out.println("1. 조회(이름), 2. 변경(아이디, 연락처), 3. 조회(나이 큰 회원) 4. 종료");
			System.out.println("선택> ");
			int menu = scn.nextInt();//Integer.parseInt(scn.nextLine());
			scn.nextLine();
			if (menu == 1) {
				System.out.println("조회할 이름을 입력:");
				String sName = scn.next();
				for(Member member : members) {
					if(member.getMemberName().equals(sName))
						member.showInfo();
					}
				}else if (menu == 2) {
				System.out.println("아이디 입력>>");
				String sId = scn.nextLine();
				System.out.println("변경할 전화번호>>");
				String phone = scn.nextLine();
				
				for(Member member : members) {
					if(member.getMemberId().equals(sId)) {
						member.setMemberPhone(phone);
						break; //
					}
				}
			    }else if (menu == 3) {
				System.out.println("나이가 큰 회원 조회");
				int sAge = scn.nextInt();
				scn.nextLine();
				for(Member member : members) {
					if(member.getMemberAge() > sAge) {
						member.showInfo();
					}
				}
		    }  else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
	       for(Member member : members) {
			member.showInfo();
		}
			}
		
		System.out.println("end of prog");
				
				}
	}
}