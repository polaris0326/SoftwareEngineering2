package po;

import vo.TransferItemVO;

public class TransferItemPO {
	
	public TransferItemPO(String account, double money, String comment) {
		super();
		this.account = account;
		this.money = money;
		this.comment = comment;
	}
	public TransferItemVO creatTransferItemVO(){
		return new TransferItemVO(account, money, comment);
	}
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
	String account;
	double money;
	String comment;

}
