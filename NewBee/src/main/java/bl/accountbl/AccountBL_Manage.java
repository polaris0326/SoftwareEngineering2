package bl.accountbl;

import blservice.accountblservice.AccountBLService_Manage;

import java.util.ArrayList;

import dataservice.accountdataservice.AccountDataService_Manage;
import vo.AccountVO;

public class AccountBL_Manage implements AccountBLService_Manage{
	
	AccountDataService_Manage ds;
	
	public AccountBL_Manage(AccountDataService_Manage ds){
		this.ds=ds;
	}
	
	public boolean addAccount(AccountVO vo){
		return ds.insert(vo.createPO());
	}
	
	public boolean modifyAccount(String name, AccountVO vo){
		return false;
	}
	
	public boolean deleteAccount(String name){
		return false;
	}
	
	public ArrayList<AccountVO> search(String info){
		return null;
	}
}
