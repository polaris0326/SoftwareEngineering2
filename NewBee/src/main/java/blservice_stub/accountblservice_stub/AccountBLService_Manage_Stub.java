package blservice_stub.accountblservice_stub;

import java.util.ArrayList;

import blservice.accountblservice.AccountBLService_Manage;
import vo.AccountVO;

public class AccountBLService_Manage_Stub implements AccountBLService_Manage{
	public boolean addAccount(AccountVO vo){
		return true;
	}
	public boolean deleteAccount(String name){
		return true;
	}
	
	public boolean modifyAccount(String name, AccountVO vo){
		return true;
	}
	
	public ArrayList<AccountVO> search(String info){
		return new ArrayList<AccountVO>();
	}
	
}
