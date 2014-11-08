package po;

import java.util.ArrayList;
import java.util.Date;

import vo.DealItemVO;
import vo.SalesBillVO;
import enums.BillState;

public class SalesBillPO extends BillPO{
	
	
	public SalesBillPO(String id, Date submitDate, String submitUser,
			BillState state, String client, String clerk, String storage,
			ArrayList<DealItemPO> items, double totalBeforeRebate,
			double rebate, double useVoucher, double totalAfterRebate,
			String comment) {
		super(id, submitDate, submitUser, state);
		this.client = client;
		this.clerk = clerk;
		this.storage = storage;
		this.items = items;
		this.totalBeforeRebate = totalBeforeRebate;
		this.rebate = rebate;
		this.useVoucher = useVoucher;
		this.totalAfterRebate = totalAfterRebate;
		this.comment = comment;
	}
	public SalesBillVO creatBillVO(){
		ArrayList<DealItemVO>itemsVO=new ArrayList<DealItemVO>();
		for(DealItemPO di:items){
			itemsVO.add(di.creatDealItemVO());
		}
		return new SalesBillVO(clerk, submitDate, clerk, state, client, clerk, storage, itemsVO, totalBeforeRebate, rebate, useVoucher, totalAfterRebate, comment);
	}
	String client;
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getClerk() {
		return clerk;
	}
	public void setClerk(String clerk) {
		this.clerk = clerk;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public ArrayList<DealItemPO> getItems() {
		return items;
	}
	public void setItems(ArrayList<DealItemPO> items) {
		this.items = items;
	}
	public double getTotalBeforeRebate() {
		return totalBeforeRebate;
	}
	public void setTotalBeforeRebate(double totalBeforeRebate) {
		this.totalBeforeRebate = totalBeforeRebate;
	}
	public double getRebate() {
		return rebate;
	}
	public void setRebate(double rebate) {
		this.rebate = rebate;
	}
	public double getUseVoucher() {
		return useVoucher;
	}
	public void setUseVoucher(double useVoucher) {
		this.useVoucher = useVoucher;
	}
	public double getTotalAfterRebate() {
		return totalAfterRebate;
	}
	public void setTotalAfterRebate(double totalAfterRebate) {
		this.totalAfterRebate = totalAfterRebate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	String clerk;
	String storage;
	ArrayList<DealItemPO> items;
	double totalBeforeRebate;
	double rebate;
	double useVoucher;
	double totalAfterRebate;
	String comment;

}
