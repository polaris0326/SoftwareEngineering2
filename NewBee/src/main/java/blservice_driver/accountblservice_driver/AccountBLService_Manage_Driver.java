package blservice_driver.accountblservice_driver;

import java.util.ArrayList;

import blservice.accountblservice.AccountBLService_Manage;
import vo.AccountVO;

public class AccountBLService_Manage_Driver{
	public void drive(AccountBLService_Manage accountBLService_Manage){
		if(accountBLService_Manage.addAccount(null)){
			System.out.println("add Account successfully");
		}
		if(accountBLService_Manage.deleteAccount(null)){
			System.out.println("delete Account successfully");
		}
		if(accountBLService_Manage.modifyAccount("name", null)){
			System.out.println("modify Account successfully");
		}
		if(accountBLService_Manage.search(null).add(null)){
			System.out.println("search Account successfully");
		}
	}
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
