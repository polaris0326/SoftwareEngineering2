package vo;

import java.io.Serializable;

import po.CashItemPO;

public class CashItemVO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CashItemVO(String reason, double money, String comment) {
		super();
		this.reason = reason;
		this.money = money;
		this.comment = comment;
	}
	
	String reason;
	double money;
	String comment;
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
	public CashItemPO createPO() {
		// TODO Auto-generated method stub
		return new CashItemPO(reason,money,comment);
	}

}
