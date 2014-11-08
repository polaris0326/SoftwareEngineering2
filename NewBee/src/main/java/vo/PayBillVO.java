package vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import enums.BillState;

public class PayBillVO extends BillVO implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PayBillVO(String id, Date submitDate, String submitUser,
			BillState state, String client, ArrayList<TransferItemVO> items,
			double total) {
		super(id, submitDate, submitUser, state);
		this.client = client;
		this.items = items;
		this.total = total;
	}
	String client;
	ArrayList<TransferItemVO> items;
	double total;//自动计算得出
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public ArrayList<TransferItemVO> getItems() {
		return items;
	}
	public void setItems(ArrayList<TransferItemVO> items) {
		this.items = items;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
