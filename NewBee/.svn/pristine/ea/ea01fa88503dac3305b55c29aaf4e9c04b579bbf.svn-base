package blservice_driver.clientblservice_driver;

import blservice.clientblservice.ClientBLService_TransferHandle;

public class ClientBLService_Transfer_Driver {

	public void drive(ClientBLService_TransferHandle clientBLService_Transfer){
		if(clientBLService_Transfer.isReceivablePastLimit("name", 0)){
			System.out.println("Past limit is done");
		}
		
		clientBLService_Transfer.clientPayableChange("name", 0);
		
		clientBLService_Transfer.clientReceivableChange("name", 0);
	}
}
