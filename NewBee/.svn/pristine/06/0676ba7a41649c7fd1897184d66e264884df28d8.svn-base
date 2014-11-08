package po;

import java.util.Date;

import vo.SetWarningLineBillVO;
import enums.BillState;

public class SetWarningLineBillPO extends BillPO{
	
	
	public SetWarningLineBillPO(String id, Date submitDate, String submitUser,
			BillState state, String comID, int amount) {
		
		super(id, submitDate, submitUser, state);
		this.comID = comID;
		this.amount = amount;
	}
	public SetWarningLineBillVO creatSetWarningLineBillVO(){
		return new SetWarningLineBillVO(id, submitDate, submitUser, state, comID, amount);
	}
	
	String comID;
	
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
	int amount;
	//vo中amount数据类型改一下
	

}
