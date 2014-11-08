package blservice.strategyblservice;

import java.util.ArrayList;
import java.util.Date;

import vo.CommodityTreeVO;
import vo.PackVO;

public interface StrategyBLS_PackManage {
	
	public CommodityTreeVO getComTree ();
	
	public void addPackItem(String id, int amount);
	public void delPackItem(String id);
	public boolean addPackStrategy (Date d1, Date d2,double money);
	
	public ArrayList<PackVO> getPackStrategyList();
	
}
