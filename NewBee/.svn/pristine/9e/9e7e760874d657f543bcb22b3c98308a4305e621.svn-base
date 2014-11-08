package blservice.salesblservice;

import java.util.ArrayList;

import vo.ClientVO;
import vo.CommodityTreeVO;

public interface SalesBLS_Add {
	
	//进货销售人员不需要了解商品和客户的详情以做出决策，故界面并不需要拿到com和client的vo用来显示其详情，所以不需要findCommodity和findclient方法
	public CommodityTreeVO getCommodityTree();
	public ArrayList<ClientVO> getClientList();
	public void addComItem(String id, int amount, double unit, String comment);
	public void delComItem(String id);
	public boolean submitSalesBill(String client, String clerk, int stock, 
			double rebate, double useVoucher, String comment);

	//若销售列表为空或从用户界面得到的其他信息不完备，返回false。否则，自动计算完善SalesBillVO，提交至总经理审批
}
