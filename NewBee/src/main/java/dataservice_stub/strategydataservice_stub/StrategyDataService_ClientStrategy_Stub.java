package dataservice_stub.strategydataservice_stub;

import java.util.ArrayList;

import dataservice.strategydataservice.StrategyDataService_ClientStrategy;
import po.ClientRebateStrategyPO;
import po.ClientVoucherStrategyPO;

public class StrategyDataService_ClientStrategy_Stub implements StrategyDataService_ClientStrategy{
	
	public ArrayList<ClientRebateStrategyPO> getClientRebateStrategy(){
		return new ArrayList<ClientRebateStrategyPO>();
	}
	public void insertClientRebateStrategy(ClientRebateStrategyPO po){
		System.out.println("Success!");
	}
	
	public ArrayList<ClientVoucherStrategyPO> getClientVoucherStrategy(){
		return new ArrayList<ClientVoucherStrategyPO>();
	}
	public void insertClientVoucherStrategy(ClientVoucherStrategyPO po){
		System.out.println("Success!");
	}

}
