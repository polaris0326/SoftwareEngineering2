package blservice_stub.clientblservice_stub;

import java.util.ArrayList;

import vo.ClientVO;
import blservice.clientblservice.ClientBLService_Manage;

public class ClientBLService_Manage_Stub implements ClientBLService_Manage{

	public boolean addClient(ClientVO vo) {
		// TODO Auto-generated method stub
		if (vo.equals(new ClientVO("id", 0, "name", "tel", "address", "postCode", "email",
				0, 0, 0, "defaultClerk")))
		return false;
		return true;
		
	}

	public boolean deleteClient(String name) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean modifyClient(String name, ClientVO vo) {
		// TODO Auto-generated method stub
		return true;
	}

	public ArrayList<ClientVO> search(String info) {
		// TODO Auto-generated method stub
		return new ArrayList<ClientVO>();
	}

}
