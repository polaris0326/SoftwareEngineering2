package blservice.accountblservice;

import java.util.ArrayList;

import po.ClientPO;
import vo.AccountVO;
import vo.ClientVO;

public interface AccountBLService_Pay {
	public boolean addToPayAccounts(String name, double money, String comment);
	//检查账户余额是否大于支付额，若是，返回false。若否，向转账列表中加入账户、金额、备注条目
	public void deleteFromPayAccounts(String name);
	public void addPayClient(String name);
	public boolean submitPayBill();
	
	public ArrayList<ClientVO> getClientList();//通过ClientBLS_Info接口从clientbl模块拿到clientpo转换为vo传给ui
	public ArrayList<AccountVO> getAccountList();
}
