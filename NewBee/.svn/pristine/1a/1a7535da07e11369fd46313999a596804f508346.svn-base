package vo;

import java.io.Serializable;
import java.util.Date;

import po.SetWarningLineBillPO;
import enums.BillState;

public class SetWarningLineBillVO extends BillVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public SetWarningLineBillVO(String id, Date submitDate, String submitUser,
			BillState state, String comID, int amount) {
		super(id, submitDate, submitUser, state);
		this.comID=comID;
		this.amount = amount;
	}
	//一样是id2这里的问题
	public SetWarningLineBillPO createPO(){
		return new SetWarningLineBillPO(id, submitDate, submitUser,
				 state, comID, amount);
	}
	String comID;
	int amount;
	public String getComID() {
		return comID;
	}
	public void setComID(String id) {
		this.comID = id;
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
