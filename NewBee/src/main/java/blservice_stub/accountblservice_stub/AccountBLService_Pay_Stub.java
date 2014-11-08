package blservice_stub.accountblservice_stub;

import blservice.accountblservice.AccountBLService_Pay;

public class AccountBLService_Pay_Stub implements AccountBLService_Pay{
	public boolean addToPayAccounts(String name, double money, String comment){
		return true;
	}
	//检查账户余额是否大于支付额，若是，返回false。若否，向转账列表中加入账户、金额、备注条目
	public void deleteFromPayAccounts(String name){
		System.out.println("Success!");
	}
	public void addPayClient(String name){
		System.out.println("Success!");
	}
	public boolean submitPayBill(){
		return true;
	}
}
