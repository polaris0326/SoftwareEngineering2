package blservice.accountblservice;

import java.util.ArrayList;

import vo.AccountVO;

public interface AccountBLService_Manage {
	
	public boolean addAccount(AccountVO vo);
	
	public boolean deleteAccount(String name);
	
	public boolean modifyAccount(String name, AccountVO vo);
	
	public ArrayList<AccountVO> search(String info);
	
	public ArrayList<AccountVO> getAccountList();
	public AccountVO findAccount(String name);

}
