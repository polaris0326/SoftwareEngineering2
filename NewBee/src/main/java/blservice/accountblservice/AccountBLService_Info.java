package blservice.accountblservice;

import java.util.ArrayList;

import po.AccountPO;

public interface AccountBLService_Info {
	//由accountbl提供给bl层其他需要用到账户列表的模块,所以用的是PO
	public ArrayList<AccountPO> getAccountList();
	public AccountPO findAccount(String name);
}
