package blservice.importblservice;

import java.util.ArrayList;

import vo.ClientVO;
import vo.CommodityTreeVO;

public interface ImportBLS_Add {
	
	//进货销售人员不需要了解商品和客户的详情以做出决策，故界面并不需要拿到com和client的vo用来显示其详情，所以不需要findCommodity和findclient方法
		public CommodityTreeVO getCommodityTree();
		public ArrayList<ClientVO> getClientList();
		public void addComItem(String id, int amount, double unit,String comment);
		public void delComItem(String id);
		public boolean submitImportBill(String client, int stock, String comment);
		
}
