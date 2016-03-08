package prob3;

public class Account {
	
	//field
	private String accountNo; 
	private int balance;
	
	//constructor
	public Account(String s){
		this.accountNo = s;
		this.balance = 0;
		System.out.println(accountNo+"계좌가 개설되었습니다.");
	}
	
	//method
	
	public void save(int money){
		System.out.println();
		balance += money;
		System.out.println(accountNo+"계좌에 "+money+"만원이 입금되었습니다.");	
	}
	
	public void withdraw(int money){
		System.out.println();
		balance -= money;
		System.out.println(accountNo+"계좌에 "+money+"만원이 출금되었습니다.");
	}
	
	//getter&setter
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	} 
	
}
