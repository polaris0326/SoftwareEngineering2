package blservice.accountblservice;

import java.util.Date;

import vo.BusinessConditionVO;

public interface AccountBLService_BusinessCondition {
	public BusinessConditionVO businessCondition(Date d1, Date d2);
	public void businessConditionExportExcel();
	
}
