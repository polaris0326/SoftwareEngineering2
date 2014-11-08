package dataservice_stub.accountdataservice_stub;

import po.AccountPO;
import dataservice.accountdataservice.AccountDataService_Find;

public class AccountDataService_Find_Stub implements AccountDataService_Find {

	public AccountPO find(String name) {
		// TODO Auto-generated method stub
		return new AccountPO("name", 0);
	}

}
