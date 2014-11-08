package blservice_stub.salesblservice_stub;

import java.util.ArrayList;

import vo.ClientVO;
import vo.CommodityTreeVO;
import blservice.salesblservice.SalesBLS_Add;

public class SalesBLS_Add_Stub implements SalesBLS_Add{

	public CommodityTreeVO getCommodityTree() {
		// TODO Auto-generated method stub
		return new CommodityTreeVO(null);
	}

	public ArrayList<ClientVO> getClientList() {
		// TODO Auto-generated method stub
		return new ArrayList<ClientVO>();
	}

	public void addComItem(String id, int amount, double unit, String comment) {
		// TODO Auto-generated method stub
		System.out.println("Add successfully");
	}

	public void delComItem(String id) {
		// TODO Auto-generated method stub
		System.out.println("Delete successfully");
	}

	public boolean submitSalesBill(String client, String clerk, int stock,
			double rebate, double useVoucher, String comment) {
		// TODO Auto-generated method stub
		return true;
	}

}
