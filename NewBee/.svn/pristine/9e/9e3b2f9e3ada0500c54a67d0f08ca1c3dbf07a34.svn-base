package po;

import java.util.Date;

import vo.MarketRebateStrategyVO;

public class MarketRebateStrategyPO extends StrategyPO{
	
	public MarketRebateStrategyPO(Date start, Date end, double sum,
			double rebate) {
		super(start,end);
		this.sum = sum;
		this.rebate = rebate;
	}
	public MarketRebateStrategyVO creatMarketRebateStrategyVO(){
		return new MarketRebateStrategyVO(start, end, sum, rebate);
	}

	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getRebate() {
		return rebate;
	}
	public void setRebate(double rebate) {
		this.rebate = rebate;
	}

	double sum;
	double rebate;

}
