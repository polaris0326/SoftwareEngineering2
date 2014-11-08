package vo;

import java.io.Serializable;
import java.util.Date;

import po.ComCorrectBillPO;
import enums.BillState;

public class ComCorrectBillVO extends BillVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public ComCorrectBillVO(String id, Date submitDate, String submitUser,
			BillState state, String comID, int offset) {
		super(id, submitDate, submitUser, state);
		this.comID = comID;
		this.offset = offset;
	}
	
	public ComCorrectBillPO createPO(){
		return new ComCorrectBillPO(id,submitDate,submitUser,
				state,comID,offset);
	}
	String comID;
	int offset;
	
	public String getComId() {
		return comID;
	}
	public void setComID(String id) {
		this.comID = id;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
