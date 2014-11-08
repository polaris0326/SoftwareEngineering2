package vo;

import java.io.Serializable;
import java.util.ArrayList;

public class PresentListVO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PresentListVO(ArrayList<ComAmountItemVO> items) {
		super();
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
