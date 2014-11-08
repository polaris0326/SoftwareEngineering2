package dataservice.clientdataservice;

import java.util.ArrayList;

import po.ClientPO;

public interface ClientDataService_Manage {

	public ArrayList<ClientPO> search(String info);
	
	public boolean insert(ClientPO po);
	
	public boolean delete(String name);
	
	public boolean update(String name, ClientPO po);
}
