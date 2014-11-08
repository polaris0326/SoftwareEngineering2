package blservice_driver.accountblservice_driver;

import blservice.accountblservice.AccountBLService_Receive;

public class AccountBLService_Receive_Driver{
	public void drive(AccountBLService_Receive accountBLService_Receive){
		accountBLService_Receive.addReceiveClient("name");
		accountBLService_Receive.deleteFromReceiveAccounts("name");
		accountBLService_Receive.addToReceiveAccounts("name", 0, "comment");
		accountBLService_Receive.addReceiveClient(null);
		if(accountBLService_Receive.submitReceiveBill()){
			System.out.println("submit ReceiveBil successfully");
		}
	}
}
