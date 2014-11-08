package blservice.billblservice;

public interface BillBLS_ChangeHandle_Com {
	
	public void changeComID(String old, String newID);
	//查找所有包含已修改商品的单据并修改为新ID
	public void changeComNameModel (String id, String newName, String newModel);
	//查找所有包含已修改商品的单据并修改为新名称型号

}
