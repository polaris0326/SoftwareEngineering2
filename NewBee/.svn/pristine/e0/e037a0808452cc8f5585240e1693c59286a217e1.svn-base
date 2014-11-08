package blservice_driver.accountblservice_driver;

import blservice.accountblservice.AccountBLService_Cash;

public class AccountBLService_Cash_Driver{
	public void drive(AccountBLService_Cash accountBLService_Cash){
		accountBLService_Cash.addToCashItem("reason", 0, "comment");
		accountBLService_Cash.deleteCashItem("reason");
		accountBLService_Cash.addCashAccount("name");
		if(accountBLService_Cash.submitCashBill()){
			System.out.println("submit CashBill successfully");
		}
	}

}
