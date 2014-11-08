package blservice_stub.billblservice_stub;

import java.util.ArrayList;
import java.util.Date;

import blservice.billblservice.BillBLS_Info_Log;
import vo.BillVO;

public class BillBLS_Info_Log_Stub implements BillBLS_Info_Log{
	
	public ArrayList<BillVO> getLog(Date d1, Date d2){
		return new ArrayList<BillVO>();
	}

}
