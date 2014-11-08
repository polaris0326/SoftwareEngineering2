package dataservice_driver.accountdataservice_driver;

import po.AccountPO;
import dataservice.accountdataservice.AccountDataService_Manage;

public class AccountDataService_Manage_Driver {

	public void drive(AccountDataService_Manage accountDataService_Manage){
		if(accountDataService_Manage.insert(null)){
			System.out.println("Insert successfully");
		}
		
		if(accountDataService_Manage.delete("name")){
			System.out.println("Delete successfully");
		}
		
		if(accountDataService_Manage.update("name", new AccountPO("name",0))){
			System.out.println("Update successfully");
		}
	}
}
