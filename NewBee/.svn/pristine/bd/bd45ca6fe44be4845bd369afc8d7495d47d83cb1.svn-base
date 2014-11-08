package po;

import java.util.ArrayList;
import java.util.Date;

import vo.ComAmountItemVO;
import vo.PresentStrategyVO;

public class PresentStrategyPO extends StrategyPO{
	
	
	public PresentStrategyPO(Date start, Date end,
			ArrayList<ComAmountItemPO> items, int level,
			ArrayList<String> alreadyPresentedClient) {
		super(start, end);
		this.items = items;
		this.level = level;
		this.alreadyPresentedClient = alreadyPresentedClient;
	}
	public PresentStrategyVO creatPresentStrategyVO(){
		ArrayList<ComAmountItemVO>itemsVO=new ArrayList<ComAmountItemVO>();
		for (ComAmountItemPO ca:items){
			itemsVO.add(ca.creatComAmountItemVO());
		}
		return new PresentStrategyVO(start, end, itemsVO, level, alreadyPresentedClient);
	}
	ArrayList<ComAmountItemPO> items;
	public ArrayList<ComAmountItemPO> getItems() {
		return items;
	}
	public void setItems(ArrayList<ComAmountItemPO> items) {
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
	int level;
	ArrayList<String> alreadyPresentedClient=new ArrayList<String>();

}
