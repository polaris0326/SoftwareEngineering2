package dataservice.accountdataservice;

import java.util.ArrayList;

import po.FinalBusinessConditionPO;

public interface AccountDataService_Final {

	public void addFinalBusinessCondition(FinalBusinessConditionPO po);
	
	public ArrayList<FinalBusinessConditionPO> getFinalBusinessCondition();
}
