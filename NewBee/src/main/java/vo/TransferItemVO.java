package vo;

import java.io.Serializable;

import po.TransferItemPO;

public class TransferItemVO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TransferItemVO(String account, double money, String comment) {
		super();
		this.account = account;
		this.money = money;
		this.comment = comment;
	}
	
	public TransferItemPO createPO(){
		return new TransferItemPO( account, money, comment);
	}
	String account;
	double money;
	String comment;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
