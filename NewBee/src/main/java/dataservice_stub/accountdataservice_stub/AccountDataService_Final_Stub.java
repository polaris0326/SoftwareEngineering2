package dataservice_stub.accountdataservice_stub;

import java.util.ArrayList;

import po.FinalBusinessConditionPO;
import dataservice.accountdataservice.AccountDataService_Final;

public class AccountDataService_Final_Stub implements AccountDataService_Final {

	public void addFinalBusinessCondition(FinalBusinessConditionPO po) {
		// TODO Auto-generated method stub
		System.out.println("Add business condition successfully!");
	}

	public ArrayList<FinalBusinessConditionPO> getFinalBusinessCondition() {
		// TODO Auto-generated method stub
		return new ArrayList<FinalBusinessConditionPO>();
	}

}
