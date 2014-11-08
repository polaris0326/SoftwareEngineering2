package vo;

import java.io.Serializable;

import po.AccountPO;

public class AccountVO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AccountVO(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	public AccountPO createPO(){
		return new AccountPO(name,balance);
	}
	String name;
	double balance;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
