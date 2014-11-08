package blservice_stub.billblservice_stub;

import blservice.billblservice.BillBLS_ChangeHandle_Account;

public class BillBLS_ChangeHandle_Account_Stub implements BillBLS_ChangeHandle_Account{
	
	public void changeAccountName(String old, String newName){
		System.out.println("Success!");
	}
	//查找所有包含已修改商品的单据并修改为新名称型号

}
