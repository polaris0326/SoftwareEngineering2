package blservice_stub.accountblservice_stub;

import java.util.ArrayList;
import java.util.Date;

import vo.BillVO;
import blservice.accountblservice.AccountBLService_BillHistory;

public class AccountBLService_BillHistory_Stub implements AccountBLService_BillHistory{
	public ArrayList<BillVO> billHistory(Date d1, Date d2, String billType, 
			String clientName, String clerkName, String storage){
		return new ArrayList<BillVO>();
	}
	public void writeOff(BillVO vo){
		System.out.println("Success!");
	}
	public void billHistoryExportExcel(){
		System.out.println("Success!");
	}
}
