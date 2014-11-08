package blservice.salesblservice;

import java.util.ArrayList;

import vo.SalesBillVO;

public interface SalesBLS_Manage {
	
	public boolean deleteSale(String id);
	public ArrayList<SalesBillVO> getSalesRecord();

}
