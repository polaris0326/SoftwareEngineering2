package blservice_stub.clientblservice_stub;

import blservice.clientblservice.ClientBLService_TransferHandle;

public class ClientBLService_Transfer_Stub implements ClientBLService_TransferHandle {

	public boolean isReceivablePastLimit(String name, double money) {
		// TODO Auto-generated method stub
		return true;
	}

	public void clientPayableChange(String name, double money) {
		// TODO Auto-generated method stub
		System.out.println("Payable change success");
	}

	public void clientReceivableChange(String name, double money) {
		// TODO Auto-generated method stub
		System.out.println("Receivable change success");
	}

}