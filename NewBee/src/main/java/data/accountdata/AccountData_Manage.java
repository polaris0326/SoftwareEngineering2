package data.accountdata;

import java.util.HashMap;

import po.AccountPO;
import dataservice.accountdataservice.AccountDataService_Manage;

public class AccountData_Manage implements AccountDataService_Manage{
	
	private HashMap<String,AccountPO> accounts;
	
	public AccountData_Manage(HashMap<String,AccountPO> a){
		this.accounts=a;
	}

	public boolean insert(AccountPO po) {
		
		if (accounts.containsKey(po.getName())){
			return false;
		}
		else{
			accounts.put(po.getName(),po );
			return true;
		}
	}

	public boolean delete(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(String name, AccountPO po) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
