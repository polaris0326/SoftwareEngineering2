package blservice.commodityblservice;
import java.util.ArrayList;
import java.util.Date;

import vo.*;

public interface CommodityBLService_StockCheck {
	public ArrayList<StockCheckInfoVO> stockCheck(Date d1,Date d2);
	//返回该时间段内的库存查看信息（每个发生过进货或销售的商品的出入库数量与金额、库存增减量、现有库存量）
}
