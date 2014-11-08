package blservice_driver.billblservice_driver;


import blservice.billblservice.BillBLS_Info_Import;

public class BillBLS_Info_Import_Driver {
	public void drive(BillBLS_Info_Import billBLS_Info_Import) {
		if (billBLS_Info_Import.getImportRecordByTime(null, null).add(null)) {
			System.out.println("get ImportRecord By Time successfully");
		}
	}
}
