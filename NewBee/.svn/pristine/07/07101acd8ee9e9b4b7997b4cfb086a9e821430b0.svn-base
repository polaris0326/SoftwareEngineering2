package dataservice_driver.strategydataservice_driver;

import java.util.ArrayList;
import dataservice.strategydataservice.StrategyDataService_SalesQuery;
import vo.ComAmountItemVO;
import vo.PresentListVO;

public class StrategyDataService_SalesQuery_Driver{
	public void drive(StrategyDataService_SalesQuery strategyDataService_SalesQuery){
		if(strategyDataService_SalesQuery.getPresent().equals(new PresentListVO(new ArrayList<ComAmountItemVO>()))){
			System.out.println("get Present successfully");
		}
		if(strategyDataService_SalesQuery.getRebate()==0){
			System.out.println("get Rebate successfully");
		}
		if(strategyDataService_SalesQuery.getVoucher()==0){
			System.out.println("get Voucher successfully");
		}
		strategyDataService_SalesQuery.addSaleInfo(0, 0, null);
	}
	

}
