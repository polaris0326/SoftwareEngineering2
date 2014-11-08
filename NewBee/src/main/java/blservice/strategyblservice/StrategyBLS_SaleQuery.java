package blservice.strategyblservice;

import vo.PresentListVO;
import vo.SalesBillVO;

public interface StrategyBLS_SaleQuery {
	
	public void addSaleBill(SalesBillVO vo);
	public double getMaxRebate();
	public double getMaxVoucher();
	public PresentListVO getDeservedPresent();
	
	

}
