package blservice_driver.accountblservice_driver;

import blservice.accountblservice.AccountBLService_SalesDetail;

public class AccountBLService_SalesDetail_Driver{
	public void drive(AccountBLService_SalesDetail accountBLService_SalesDetail){
		accountBLService_SalesDetail.salesDetailExportExcel();
		if(accountBLService_SalesDetail.salesDetail(null, null, "comName", "clientName", "clerkName", "storage").add(null)){
			System.out.println("get salesDetail successfully");
		}
	}
}
