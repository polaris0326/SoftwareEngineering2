package po;

import java.util.ArrayList;
import java.util.Date;

import vo.DealItemVO;
import vo.ImportBillVO;
import enums.BillState;


public class ImportBillPO extends BillPO{
	
	
	
	public ImportBillPO(String id, Date submitDate, String submitUser,
			BillState state, String client, String storage, String comment,
			double total, ArrayList<DealItemPO> items) {
		super(id, submitDate, submitUser, state);
		this.client = client;
		this.storage = storage;
		this.comment = comment;
		this.total = total;
		this.items = items;
	}
	public ImportBillVO creatImportBillVO(){
		ArrayList<DealItemVO> itemsVO =new ArrayList<DealItemVO>();
		for(DealItemPO ib:items){
			itemsVO.add(ib.creatDealItemVO());
		}
		return new ImportBillVO(client, submitDate, client, state, client, storage, comment, total, itemsVO);
	}
	String client;
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public ArrayList<DealItemPO> getItems() {
		return items;
	}
	public void setItems(ArrayList<DealItemPO> items) {
		this.items = items;
	}
	String storage;
	String comment;
	double total;
	//vo中修改total数据类型
	ArrayList<DealItemPO> items;


}
