package blservice_driver.accountblservice_driver;

import blservice.accountblservice.AccountBLService_TransferHandle;

public class AccountBLService_Transfer_Driver{
	public void drive(AccountBLService_TransferHandle accountBLService_Transfer){
		accountBLService_Transfer.accountBalanceChange("name", 0);
		if(accountBLService_Transfer.isAccountEnough("name", 0)){
			System.out.println("get isAccountEnough successfully");
		}
	}
}
