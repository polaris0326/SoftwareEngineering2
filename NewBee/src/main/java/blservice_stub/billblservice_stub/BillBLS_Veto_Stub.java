package blservice_stub.billblservice_stub;

import java.util.ArrayList;

import blservice.billblservice.BillBLS_Veto;

public class BillBLS_Veto_Stub implements BillBLS_Veto{

	public void vetoBill(String billID){
		System.out.println("Success!");
	}
	public void batchVeto(ArrayList<String> ids){
		System.out.println("Success!");
	}
}
