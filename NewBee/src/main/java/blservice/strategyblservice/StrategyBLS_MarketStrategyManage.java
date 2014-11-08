package blservice.strategyblservice;
import java.util.*;

import vo.MarketRebateStrategyVO;
import vo.MarketVoucherStrategyVO;


public interface StrategyBLS_MarketStrategyManage {
	
	public ArrayList<MarketRebateStrategyVO> getMarketRebateList ();
	public ArrayList<MarketVoucherStrategyVO> getMarketVoucherList();
	
	public void addMarketRebateStrategy (MarketRebateStrategyVO vo);
	public void addMarketVoucherStrategy(MarketVoucherStrategyVO vo);
	
}
