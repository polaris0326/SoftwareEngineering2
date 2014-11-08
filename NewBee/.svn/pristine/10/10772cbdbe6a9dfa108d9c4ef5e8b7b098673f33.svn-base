package po;

import java.util.ArrayList;
import java.util.Date;

import vo.PayBillVO;
import vo.TransferItemVO;
import enums.BillState;


public class PayBillPO extends BillPO{
	
	
	
	public PayBillPO(String id, Date submitDate, String submitUser,
			BillState state, String client, ArrayList<TransferItemPO> items,
			double total) {
		super(id, submitDate, submitUser, state);
		this.client = client;
		this.items = items;
		this.total = total;
	}
	public PayBillVO creatPayBillVO(){
		ArrayList<TransferItemVO> itemsVO =new ArrayList<TransferItemVO>();
		for(TransferItemPO ts:items){
			itemsVO.add(ts.creatTransferItemVO());
		}
		return new PayBillVO(client, submitDate, client, state, client, itemsVO, total);
	}
	String client;
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public ArrayList<TransferItemPO> getItems() {
		return items;
	}
	public void setItems(ArrayList<TransferItemPO> items) {
		this.items = items;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	ArrayList<TransferItemPO> items;
	double total;//自动计算得出

}
