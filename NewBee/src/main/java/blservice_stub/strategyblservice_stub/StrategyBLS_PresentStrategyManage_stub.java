package blservice_stub.strategyblservice_stub;
import java.util.ArrayList;
import java.util.Date;

import blservice.strategyblservice.StrategyBLS_PresentStrategyManage;
import vo.*;

public class StrategyBLS_PresentStrategyManage_stub implements StrategyBLS_PresentStrategyManage{
	
	public void addPresentItem(String id, int amount){
		
	}
	public void delPresentItem(String id){
		
	}
	public boolean addPresentStrategy (Date d1, Date d2, double money, int clientLevel){
		return true;
	}
	
	public ArrayList<PresentStrategyVO> getPresentStrategyList(){
		return new ArrayList<PresentStrategyVO>();
	}

}
