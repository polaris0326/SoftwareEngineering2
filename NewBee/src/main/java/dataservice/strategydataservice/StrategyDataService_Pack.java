package dataservice.strategydataservice;

import java.util.ArrayList;

import po.PackPO;

public interface StrategyDataService_Pack {
	
	public ArrayList<PackPO> getPack();
	public void insertPack(PackPO po);

}
