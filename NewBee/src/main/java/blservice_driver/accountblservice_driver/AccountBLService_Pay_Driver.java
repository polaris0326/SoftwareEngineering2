package blservice_driver.accountblservice_driver;

import blservice.accountblservice.AccountBLService_Pay;

public class AccountBLService_Pay_Driver{
	
	public void drive(AccountBLService_Pay accountBLService_Pay){
		accountBLService_Pay.addPayClient("name");
		accountBLService_Pay.deleteFromPayAccounts(null);
		if(accountBLService_Pay.addToPayAccounts("name", 0, "comment")){
			System.out.println("add ToPayAccounts successfully");
		}
		if(accountBLService_Pay.submitPayBill()){
			System.out.println("submit PayBill successfully");
		}
		
	}
}
