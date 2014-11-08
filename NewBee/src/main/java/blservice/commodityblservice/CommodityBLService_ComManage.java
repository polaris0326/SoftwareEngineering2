package blservice.commodityblservice;

import java.util.ArrayList;
import vo.CommodityTreeVO;
import vo.CommodityVO;
import vo.TypeVO;

public interface CommodityBLService_ComManage {
	public boolean addCommodity(TypeVO type, CommodityVO com);
	//添加商品
	public boolean deleteCommodity(String id);
	//删除商品
	public boolean modifyCommodity(CommodityVO vo);
	//修改商品
	
	public ArrayList<CommodityVO>  search(String info);
	//查找
	public CommodityTreeVO getComTree();
	public CommodityVO findCommodity(String id);

}
