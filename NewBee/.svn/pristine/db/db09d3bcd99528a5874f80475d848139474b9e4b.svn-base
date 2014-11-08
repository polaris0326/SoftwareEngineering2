package vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import enums.BillState;

public class PresentBillVO extends BillVO implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PresentBillVO(String id, Date submitDate, String submitUser,
			BillState state, ArrayList<ComAmountItemVO> items) {
		super(id, submitDate, submitUser, state);
		this.items = items;
	}

	ArrayList<ComAmountItemVO> items;

	public ArrayList<ComAmountItemVO> getItems() {
		return items;
	}

	public void setItems(ArrayList<ComAmountItemVO> items) {
		this.items = items;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
