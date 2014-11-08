package dataservice_stub.clientdataservice_stub;

import java.util.ArrayList;

import po.ClientPO;
import dataservice.clientdataservice.ClientDataService_Manage;

public class ClientDataService_Manage_Stub implements ClientDataService_Manage{

	public ArrayList<ClientPO> search(String info) {
		// TODO Auto-generated method stub
		return new ArrayList<ClientPO>();
	}

	public boolean insert(ClientPO po) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean delete(String name) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean update(String name, ClientPO po) {
		// TODO Auto-generated method stub
		return true;
	}

}
