package dataservice_driver.accountdataservice_driver;

import dataservice.accountdataservice.AccountDataService_Final;

public class AccountDataService_Final_Driver {

	public void drive(AccountDataService_Final accountDataService_Final) {
		accountDataService_Final.addFinalBusinessCondition(null);
		
		if(accountDataService_Final.getFinalBusinessCondition().add(null)){
			System.out.println("Get final business condition successfully");
		}
	}
}
