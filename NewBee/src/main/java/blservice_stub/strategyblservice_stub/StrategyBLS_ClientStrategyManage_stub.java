package blservice_stub.strategyblservice_stub;

import java.util.ArrayList;

import blservice.strategyblservice.StrategyBLS_ClientStrategyManage;
import blservice.strategyblservice.StrategyBLS_PresentStrategyManage;
import vo.ClientRebateStrategyVO;
import vo.ClientVoucherStrategyVO;

public class StrategyBLS_ClientStrategyManage_stub implements StrategyBLS_ClientStrategyManage{
	
	public void addClientRebateStrategy(ClientRebateStrategyVO vo){
		
	}
	public void addClientVoucherStrategy (ClientVoucherStrategyVO vo){
		
	}
	
	public ArrayList<ClientRebateStrategyVO> getClientRebateStrategyList(){
		return new ArrayList<ClientRebateStrategyVO>();
		
	}
	public ArrayList<ClientVoucherStrategyVO> getClientVoucherStrategyList(){
		return new ArrayList<ClientVoucherStrategyVO>();
	}
	

}
