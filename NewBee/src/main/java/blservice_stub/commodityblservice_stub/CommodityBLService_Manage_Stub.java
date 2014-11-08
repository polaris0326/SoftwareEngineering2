package blservice_stub.commodityblservice_stub;

import java.util.ArrayList;

import blservice.commodityblservice.CommodityBLService_ComManage;
import vo.ComCorrectBillVO;
import vo.CommodityVO;
import vo.SetWarningLineBillVO;
import vo.TypeVO;

public class CommodityBLService_Manage_Stub implements CommodityBLService_ComManage{
	public boolean addCommodity(TypeVO type, CommodityVO vo){
	//添加商品
		return true;
	}
	public boolean deleteCommodity(String id){
	//删除商品
		return true;
	}
	public boolean modifyCommodity(CommodityVO vo){
	//修改商品
		return true;
	}
	public boolean correctCom(ComCorrectBillVO vo){
	//若vo为报损单，检查报损量是否大于现有库存量，若是，返回false。若否，提交报损报溢单据至总经理
		return true;
	}
	public boolean submitSetWarningLineBill(SetWarningLineBillVO vo){
	//向总经理提交修改商品的库存警戒线为amount的请求，返回提交成功与否
		return true;
	}
	public ArrayList<CommodityVO>  search(String info){
	//查找
		return new ArrayList<CommodityVO>();
	}
}
