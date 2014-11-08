package po;

import java.util.ArrayList;
import java.util.Date;

import vo.ComAmountItemVO;
import vo.PresentBillVO;
import enums.BillState;



public class PresentBillPO extends BillPO {
	

	public PresentBillPO(String id, Date submitDate, String submitUser,
			BillState state, ArrayList<ComAmountItemPO> items) {
		super(id, submitDate, submitUser, state);
		this.items = items;
	}
	public PresentBillVO creatPresentBillVO(){
		ArrayList<ComAmountItemVO>itemsVO=new ArrayList<ComAmountItemVO>();
		for(ComAmountItemPO ca:items){
			itemsVO.add(ca.creatComAmountItemVO());
		}
		return new PresentBillVO(id, submitDate, submitUser, state, itemsVO);
	}

	ArrayList<ComAmountItemPO> items;

	public ArrayList<ComAmountItemPO> getItems() {
		return items;
	}
	public void setItems(ArrayList<ComAmountItemPO> items) {
		this.items = items;
	}
}
