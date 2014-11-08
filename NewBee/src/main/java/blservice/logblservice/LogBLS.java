package blservice.logblservice;

import java.util.Date;
import java.util.ArrayList;

import vo.BillVO;


public interface LogBLS {
	//用于返回某时间段内所有有效的重要操作记录
	public ArrayList<BillVO> checkLog(Date d1, Date d2);
}
