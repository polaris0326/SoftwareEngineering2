package blservice.commodityblservice;

import vo.TypeVO;

public interface CommodityBLService_TypeManage {
	public boolean addType(TypeVO fatherType, String newName);
	//添加商品类型	
	public boolean deleteType(TypeVO vo);
	//删除商品类型	
	public boolean modifyType(TypeVO type, String name);
	//修改商品类型	
}
