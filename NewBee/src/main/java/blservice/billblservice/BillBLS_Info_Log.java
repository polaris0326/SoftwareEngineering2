package blservice.billblservice;

import java.util.ArrayList;
import java.util.Date;

import vo.BillVO;

public interface BillBLS_Info_Log {
	
	public ArrayList<BillVO> getLog(Date d1, Date d2);

}
