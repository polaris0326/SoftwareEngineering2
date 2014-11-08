package po;

import java.util.Date;

import vo.ComCorrectBillVO;
import enums.BillState;

public class ComCorrectBillPO extends BillPO{
	
	
	
	public ComCorrectBillPO(String id, Date submitDate, String submitUser,
			BillState state, String comID, int offset) {
		super(id, submitDate, submitUser, state);
		this.id = comID;
		this.offset = offset;
	}
	
	public ComCorrectBillVO creatComCorrectBillVO(){
		return new ComCorrectBillVO(id, submitDate, null, state, null, offset);
		//参数不足，null表示
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	String id;
	int offset;

}
