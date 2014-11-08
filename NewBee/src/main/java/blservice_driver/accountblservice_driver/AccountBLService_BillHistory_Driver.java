package blservice_driver.accountblservice_driver;

import blservice.accountblservice.AccountBLService_BillHistory;

public class AccountBLService_BillHistory_Driver {
	
	
	public void drive(AccountBLService_BillHistory accountBLService_BillHistory){
		
		vmdbcjsbdckbdkcb
		
		if(accountBLService_BillHistory.billHistory(null, null, "billType", "clientName", "clerkName", "storage").add(null)){
			System.out.println("get billhistory successfully");
		}
		accountBLService_BillHistory.writeOff(null);
		accountBLService_BillHistory.billHistoryExportExcel();
	}
}
