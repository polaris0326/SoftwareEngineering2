package blservice.billblservice;

public interface BillBLS_ChangeHandle_Client {
	
	public void changeClientID(String old, String newID);
	//查找所有包含已修改客户的单据并修改为新ID
	public void changeClientName(String old, String newID);
	//查找所有包含已修改客户的单据并修改为新名字
	
	

}
