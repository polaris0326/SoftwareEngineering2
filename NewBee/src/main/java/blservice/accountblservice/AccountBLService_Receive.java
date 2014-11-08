package blservice.accountblservice;

import java.util.ArrayList;

import po.ClientPO;
import vo.AccountVO;
import vo.ClientVO;

public interface AccountBLService_Receive {
	public void addToReceiveAccounts(String name, double money, String comment);
	public void deleteFromReceiveAccounts(String name);
	public void addReceiveClient(String name);
	public boolean submitReceiveBill();
	
	public ArrayList<ClientVO> getClientList();//通过ClientBLS_Info接口从clientbl模块拿到clientpo转换为vo传给ui
	public ArrayList<AccountVO> getAccountList();
}
