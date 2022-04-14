package co.edu;

public class Member {
       // 필드 -> 회원아이디, 회원이름, 회원연락처, 회원포인트.
	   private String memberId;
	   private String memberName;
	   private String memberPhone;
	   private int memberAge; // -14
	
	// 생성자
		
	   public Member(String memberId, String memberName, String memberphone, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberphone;
		this.memberAge = memberAge;
	}
	 
	   //메소드
	   void setMemberId(String memberId) {
		   this.memberId = memberId;		   
	   }
	   
	   String getMemberId() {
		   return memberId;
	   }
	   
	   void setMemberAge(int age) {
		   if(age < 0) {
			   memberAge = 10;
		   } else {
			   memberAge = age;

		   }
	   }
	   int getMemberAge(){
		   return memberAge;
	   }
	   
	   //메소드 불러오기
	   public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	void showInfo( ) {
		   System.out.printf("회원이름 %4s\n 연락처 %13s\n 나이 %2d\n", memberName, memberPhone, memberAge);
	   }
}
