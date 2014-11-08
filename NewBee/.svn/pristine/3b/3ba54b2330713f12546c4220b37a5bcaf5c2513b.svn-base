package vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;



public class PresentStrategyVO extends StrategyVO implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PresentStrategyVO(Date start, Date end,
			ArrayList<ComAmountItemVO> items, int level,
			ArrayList<String> alreadyPresentedClient) {
		super(start, end);
		this.items = items;
		this.level = level;
		this.alreadyPresentedClient = alreadyPresentedClient;
	}
	ArrayList<ComAmountItemVO> items;
	int level;
	ArrayList<String> alreadyPresentedClient;
	public ArrayList<ComAmountItemVO> getItems() {
		return items;
	}
	public void setItems(ArrayList<ComAmountItemVO> items) {
		this.items = items;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public ArrayList<String> getAlreadyPresentedClient() {
		return alreadyPresentedClient;
	}
	public void setAlreadyPresentedClient(ArrayList<String> alreadyPresentedClient) {
		this.alreadyPresentedClient = alreadyPresentedClient;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
