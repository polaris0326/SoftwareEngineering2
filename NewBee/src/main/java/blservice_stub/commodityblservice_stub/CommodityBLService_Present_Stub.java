package blservice_stub.commodityblservice_stub;

import blservice.commodityblservice.CommodityBLService_Present;


public class CommodityBLService_Present_Stub implements CommodityBLService_Present{
	public boolean addPresentCom(String comID, int amount){
	//检查商品库存量是否充足，若是，将一定数量商品加入赠品列表并返回true。若否，返回false。
		return true;
	}
	public void delPresentCom(String comID){
	//将对应商品从赠品列表删除
		System.out.println("Delete present Commodity Successfully");
	}
	public boolean submitPresentBill(){
	//检查赠品列表是否为空，若是，返回false。若否，向总经理提交赠送请求单（PresentBillVO），返回提交成功与否
		return true;
	}

}
