package blservice_driver.accountblservice_driver;

import blservice.accountblservice.AccountBLService_BusinessCondition;

public class AccountBLService_BusinessCondition_Driver {
	public void drive(AccountBLService_BusinessCondition accountBLService_BusinessCondition){
		accountBLService_BusinessCondition.businessCondition(null, null);
		accountBLService_BusinessCondition.businessConditionExportExcel();
	}
}
