package dataservice_driver.strategydataservice_driver;

import dataservice.strategydataservice.StrategyDataService_Pack;

public class StrategyDataService_Pack_Driver {
	public void drive(StrategyDataService_Pack strategyDataService_Pack){
		if(strategyDataService_Pack.getPack().add(null)){
			System.out.println("get Pack successfully");
		}
		strategyDataService_Pack.insertPack(null);
	}
}
