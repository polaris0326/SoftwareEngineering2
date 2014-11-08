package po;

import vo.AccountVO;


public class AccountPO {
	
	public AccountPO(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public AccountVO creatAccountVO(){
		return new AccountVO(name, balance);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	String name;
	double balance;
	
	

}
