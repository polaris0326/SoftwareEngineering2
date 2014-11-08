package dataservice_driver.accountdataservice_driver;

import java.util.ArrayList;

import po.AccountPO;
import dataservice.accountdataservice.AccountDataService_Restore;

public class AccountDataService_Restore_Driver {

	public void drive(AccountDataService_Restore accountDataService_Restore){
		accountDataService_Restore.restore(new ArrayList<AccountPO>());
	}
}
