package blservice_stub.accountblservice_stub;

import java.util.ArrayList;

import blservice.accountblservice.AccountBLService_Info;
import vo.AccountVO;
import vo.ClientVO;

public class AccountBLService_Info_Stub implements AccountBLService_Info{
	public ArrayList<AccountVO> getAccountList(){
		return new ArrayList<AccountVO>();
	}
	public ArrayList<ClientVO> getClientList(){
		return new ArrayList<ClientVO>();
	}
}
