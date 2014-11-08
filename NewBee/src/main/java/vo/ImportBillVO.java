package vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import po.DealItemPO;
import po.ImportBillPO;
import enums.BillState;

public class ImportBillVO extends BillVO implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ImportBillVO(String id, Date submitDate, String submitUser,
			BillState state, String client, String storage, String comment,
			double total, ArrayList<DealItemVO> items) {
		super(id, submitDate, submitUser, state);
		this.client = client;
		this.storage = storage;
		this.comment = comment;
		this.total = total;
		this.items = items;
	}
	
	public ImportBillPO createPO(){
		ArrayList<DealItemPO> pos=new ArrayList<DealItemPO>();
		for (DealItemVO vo: items){
			pos.add(vo.createPO());
		}
		return new ImportBillPO( id,submitDate,submitUser,
				 state, client, storage, comment,
				total,pos);
	}
	String client;
	String storage;
	String comment;
	double total;
	ArrayList<DealItemVO> items;
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
	public ArrayList<DealItemVO> getItems() {
		return items;
	}
	public void setItems(ArrayList<DealItemVO> items) {
		this.items = items;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
