package vo;

import java.io.Serializable;
import java.util.Date;

import po.BillPO;
import enums.BillState;

public class BillVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BillVO(String id, Date submitDate, String submitUser, BillState state) {
		super();
		this.id = id;
		this.submitDate = submitDate;
		this.submitUser = submitUser;
		this.state = state;
	}
	
	public BillPO createPO(){
		return new BillPO(id,submitDate,submitUser,state);
	}
	
	String id;
	Date submitDate;
	String submitUser;
	BillState state=BillState.UNSETTLED;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
