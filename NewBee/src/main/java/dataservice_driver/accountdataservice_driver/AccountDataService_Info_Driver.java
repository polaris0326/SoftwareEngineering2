package dataservice_driver.accountdataservice_driver;

import dataservice.accountdataservice.AccountDataService_Info;

public class AccountDataService_Info_Driver {
	public void drive(AccountDataService_Info accountDataService_Info){
		if(accountDataService_Info.getAccounts().add(null)){
			System.out.println("Get account successfully");
		}
	}
}
