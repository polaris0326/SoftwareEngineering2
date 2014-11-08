package dataservice_stub.clientdataservice_stub;

import po.ClientPO;
import dataservice.clientdataservice.ClientDataService_Find;

public class ClientDataService_Find_Stub implements ClientDataService_Find {

	public ClientPO find(String name) {
		// TODO Auto-generated method stub
		return new ClientPO("id", 0, "name", "tel",
				"address", "postCode", "email",
				0,0,0,"defaultClerk");
	}

}
