package blservice_driver.salesblservice_driver;

import blservice.salesblservice.SalesBLS_Manage;

public class SalesBLS_Manage_Driver {

	public void drive(SalesBLS_Manage salesBLS_Manage){
		if(salesBLS_Manage.getSalesRecord().add(null)){
    		System.out.println("Get sales record successfully");
    	}
    	
    	if(salesBLS_Manage.deleteSale("00000")){
    		System.out.println("Delete sales successfully");
    	}
	}
}
