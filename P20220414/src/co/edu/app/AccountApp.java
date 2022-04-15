package co.edu.app;

import java.util.Scanner;

public class AccountApp {
	
	//배열 초기화
	static Account[] accounts = new Account[100]; // 계좌정보를 저장하기 위한 배열.
	static Scanner scn = new Scanner(System.in);  //계좌정보 입력
	
	public void execute() {
		boolean run = true;
		while(true) {
			System.out.println("1.계좌생성 2.계좌목록 3.입금 4.출금 5.종료");
			System.out.print("선택>> ");
			
			int menu = 0;
			
			menu = scn.nextInt();
			scn.nextLine();
			
			if(menu == 1){
				createAccount();
				
			} else if(menu == 2 ) {
				accountList();
			
			} else if(menu == 3) {
				deposit();
				
			} else if(menu == 4) {
				withdraw();
			} else if(menu == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
		}
		System.out.println("end of prog.");
		
	}
	
	
	// 계좌생성 시 실행 메소드.
	public void createAccount() {
		
		System.out.println("계좌번호 생성");
		System.out.print("계좌번호 입력>>");
		String ANo = scn.next();
		
		System.out.println("예금주 생성");
		System.out.print("예금주 입력>>");
		String Owner = scn.next();
		
		System.out.println("생성시 초기 입금액");
		System.out.print("임금액 입력>>");
		int balance = scn.nextInt();
		
		Account ac = new Account(ANo, Owner, balance);
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = ac;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
			
		}
			

	}
	//입금처리 시  실행 메소드.
	public void deposit() {
		
		System.out.println("예금");
		System.out.println("입금할 계좌입력>>");
		String ANo = scn.next();
		System.out.println("입금할 금액>>");
		int balance = scn.nextInt();
		
		Account ac = findAccount(ANo);
		
		if (ac == null) {
			System.out.println("잘못된 계좌입니다.");
			return;
		}
		ac.setBalance(ac.getBalance() + balance);
		System.out.println("예금이 성공되었습니다.");
	}
	
	// 출금처리 시 실행 메소드.
	public void withdraw() {
		System.out.println("출금");
		
		System.out.println("계좌 번호 : ");
		String ANo = scn.next();
		System.out.println("출금액 : ");
		int balance = scn.nextInt();
		
		Account ac = findAccount(ANo);
		
		if (ac == null) {
			System.out.println("잘못된 계좌입니다.");
			return;
	}
		if (ac.getBalance() < balance) {
			System.out.println("예금액이 모자라 출금할 수 없습니다.");
			System.out.println("현재 잔액은" + ac.getBalance() +"원 입니다.");
			return;
		} else {
			ac.setBalance(ac.getBalance() - balance);
			System.out.println("출금이 완료되었습니다.");
		}
	}
	//전체목록 실행 메소드.
	public static void accountList(){
		System.out.println("계좌목록");
		
		for(int i=0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.println(accounts[i].getAccountNo() + accounts[i].getOwner() + accounts[i].getBalance());
			}
		}
	}
		//배열 목록 비교
	  public static Account findAccount(String ANo) {
		           for(int i =0; i < accounts.length; i++) {
		        	   if(accounts[i].getAccountNo().equals(ANo)) {
		        		   return accounts[i];
		        	   }
		        	   
		           }
	 
		           return null;
	  }
	    		 
	}

