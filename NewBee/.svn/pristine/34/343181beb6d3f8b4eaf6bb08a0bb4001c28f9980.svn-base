package blservice_driver.importblservice_driver;

import blservice.importblservice.ImportBLS_Add;

public class ImportBLS_Add_Driver {

	public void drive(ImportBLS_Add importBLS_Add) {
		if(!importBLS_Add.getCommodityTree().equals(null)){
			System.out.println("Get commodity successfully");
		}
		
		if(importBLS_Add.getClientList().add(null)){
			System.out.println("Get client list successfully");
		}
		
		importBLS_Add.addComItem("00000", 0, 0, "comment");
		
		importBLS_Add.delComItem("00000");
		
		if(importBLS_Add.submitImportBill("client", 0, "comment")){
			System.out.println("Submit import bill successfully");
		}
			
	}
}
