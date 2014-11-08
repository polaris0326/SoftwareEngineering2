package dataservice_stub.billdataservice_stub;

import dataservice.billdataservice.BillDataService_Entrance;
import po.BillPO;

public class BillDataService_Entrance_Stub implements BillDataService_Entrance{
	public void insert(BillPO po){
		System.out.println("Success!");
	}
}
