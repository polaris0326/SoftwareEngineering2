package po;

import java.util.ArrayList;

import vo.ComAmountItemVO;
import vo.PresentListVO;


public class PresentListPO {
	
	public PresentListPO(ArrayList<ComAmountItemPO> items) {
		super();
		this.items = items;
	}
	public PresentListVO creatPresentListVO(){
		ArrayList<ComAmountItemVO> itemsVO=new ArrayList<ComAmountItemVO>();
		for(ComAmountItemPO ca:items){
			itemsVO.add(ca.creatComAmountItemVO());
		}
		return new PresentListVO(itemsVO);
	}

	public ArrayList<ComAmountItemPO> getItems() {
		return items;
	}
	public void setItems(ArrayList<ComAmountItemPO> items) {
		this.items = items;
	}

	ArrayList<ComAmountItemPO> items;

}
