package blservice_stub.billblservice_stub;

import blservice.billblservice.BillBLS_ChangeHandle_Com;

public class BillBLS_ChangeHandle_Com_Stub implements BillBLS_ChangeHandle_Com{
	
	public void changeComID(String old, String newID){
		System.out.println("Success!");
	}
	//查找所有包含已修改商品的单据并修改为新ID
	public void changeComNameModel (String id, String newName, String newModel){
		System.out.println("Success!");
	}
	//查找所有包含已修改商品的单据并修改为新名称型号

}
