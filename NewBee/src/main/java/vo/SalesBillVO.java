package vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import po.DealItemPO;
import po.SalesBillPO;
import enums.BillState;

public class SalesBillVO extends BillVO implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SalesBillVO(String id, Date submitDate, String submitUser,
			BillState state, String client, String clerk, String storage,
			ArrayList<DealItemVO> items, double totalBeforeRebate,
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
	String client;
	String clerk;
	String storage;
	ArrayList<DealItemVO> items;
	double totalBeforeRebate;
	double rebate;
	double useVoucher;
	double totalAfterRebate;
	String comment;
	
	public SalesBillPO createPO(){
		ArrayList<DealItemPO> pos=new ArrayList<DealItemPO>();
		for (DealItemVO vo: items){
			pos.add(vo.createPO());
		}
		return new SalesBillPO(id, submitDate, submitUser, state, client, clerk, 
				storage, pos,totalBeforeRebate, rebate, useVoucher, totalAfterRebate, comment);
	}

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

	public ArrayList<DealItemVO> getItems() {
		return items;
	}

	public void setItems(ArrayList<DealItemVO> items) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
