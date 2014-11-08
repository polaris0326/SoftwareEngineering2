package blservice_driver.salesblservice_driver;

import blservice.salesblservice.SalesBLS_Add;

public class SalesBLS_Add_Driver {

	public void drive(SalesBLS_Add salesBLS_Add) {
		if(!salesBLS_Add.getCommodityTree().equals(null)){
			System.out.println("Get commodity successfully");
		}
		
		if(salesBLS_Add.getClientList().add(null)){
			System.out.println("Get client list successfully");
		}
		
		salesBLS_Add.addComItem("00000", 0, 0, "comment");
		
		salesBLS_Add.delComItem("00000");
		
		if(salesBLS_Add.submitSalesBill("client", "clerk", 0, 0, 0, "comment")){
			System.out.println("Submit sales bill successfully");
		}
		
	}
}
