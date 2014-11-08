package dataservice.commoditydataservice;


import po.TypePO;

public interface CommodityDataService_TypeManage {
	
	public boolean insertType(TypePO father, String newTypeName);
	public boolean deleteType(TypePO po);
	public boolean updateType(TypePO po, String newName);
	
	

}
