package dataservice_driver.strategydataservice_driver;

import dataservice.strategydataservice.StrategyDataService_MarketStrategy;

public class StrategyDataService_MarketStrategy_Driver{
	public void drive(StrategyDataService_MarketStrategy strategyDataService_MarketStrategy){
		if(strategyDataService_MarketStrategy.getMarketRebateStrategy().add(null)){
			System.out.println("get MarketRebateStrategy successfully");
		}
		if(strategyDataService_MarketStrategy.getMarketVoucherStrategy().add(null)){
			System.out.println("get MarketVoucherStrategy successfully");
		}
		strategyDataService_MarketStrategy.insertMarketRebateStrategy(null);
		strategyDataService_MarketStrategy.insertMarketVoucherStrategy(null);
	}
}
