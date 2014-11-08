package vo;

import java.io.Serializable;

import po.ComAmountItemPO;

public class ComAmountItemVO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ComAmountItemVO(String id, int amount) {
		super();
		this.id = id;
		this.amount = amount;
	}
	
	public ComAmountItemPO createPO(){
		return new ComAmountItemPO( id, amount);
	}
	
	String id;
	int amount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
