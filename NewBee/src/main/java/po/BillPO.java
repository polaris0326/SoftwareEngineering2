package po;

import java.util.Date;

import vo.BillVO;
import enums.BillState;

public class BillPO {
	
	public BillPO(String id, Date submitDate, String submitUser, BillState state) {
		super();
		this.id = id;
		this.submitDate = submitDate;
		this.submitUser = submitUser;
		this.state = state;
	}
	public BillVO creatBillVO(){
		return new BillVO(id, submitDate, submitUser, state);
	}
	
	String id=null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	public String getSubmitUser() {
		return submitUser;
	}
	public void setSubmitUser(String submitUser) {
		this.submitUser = submitUser;
	}
	public BillState getState() {
		return state;
	}
	public void setState(BillState state) {
		this.state = state;
	}

	Date submitDate=null;
	String submitUser;
	BillState state=BillState.UNSETTLED;

}
