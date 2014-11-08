package blservice_stub.accountblservice_stub;

import java.util.ArrayList;
import java.util.Date;

import blservice.accountblservice.AccountBLService_SalesDetail;
import vo.SalesBillVO;

public class AccountBLService_SalesDetail_Stub implements AccountBLService_SalesDetail{
	public ArrayList<SalesBillVO> salesDetail(Date d1, Date d2, String comName, 
			String clientName, String clerkName, String storage){
		return new ArrayList<SalesBillVO>();
	}
	public void salesDetailExportExcel(){
		System.out.println("Success!");
	}
}
