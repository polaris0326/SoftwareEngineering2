package blservice.clientblservice;

import java.util.ArrayList;

import vo.ClientVO;

public interface ClientBLService_Manage {
	//用于管理相关
	
	public ArrayList<ClientVO> getClientList();
	public ClientVO findClient(String name);
	
	public boolean addClient(ClientVO vo);
	
	public boolean deleteClient(String name);
	
	public boolean modifyClient(String name, ClientVO vo);
	
	public ArrayList<ClientVO> search(String info);
	
}
