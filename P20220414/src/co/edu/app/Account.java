package co.edu.app;

public class Account {
	//필드 : 계좌번호, 예금주, 잔액 12-222
	
	private String AccountNo;
	private String  owner;
	private int balance;

	//생성자 :
	public Account(String AccountNo, String owner, int balance) {
		this.AccountNo = AccountNo;
		this.owner = owner;
		this.balance = balance;
		
	}

	// Getter, Setter
	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
		
	public void getInfo() {
		//계좌번호, 예금주, 잔액 12-222
		System.out.printf("$3d %-10s %-10d\n", //
				this.AccountNo, this.owner, this.balance);
	}
	
	public void getDetailInfo() {
		//계좌번호, 예금주, 잔액 12-222
		
		String info = "========================================" +//
		              "계좌번호 : %5d            예금주 :  %-5s" +//
				      "잔액 : %5d" +
				      "========================================";//
		System.out.printf("", //
				this.AccountNo,  this.owner, this.balance );
	}

}

