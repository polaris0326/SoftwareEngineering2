package dataservice_stub.billdataservice_stub;

import java.util.Date;

import dataservice.billdataservice.BillDataService_Info_Log;

public class BillDataService_Info_Log_Stub implements BillDataService_Info_Log{
	
	public void getLog(Date d1, Date d2){
		System.out.println("Success!");
	}

}
