package po;

import java.util.Date;

import vo.MarketVoucherStrategyVO;

public class MarketVoucherStrategyPO extends StrategyPO{
	
	public MarketVoucherStrategyPO(Date start, Date end, double sum,
			double rebate) {
		super(start,end);
		this.sum = sum;
		this.rebate = rebate;
	}
	public MarketVoucherStrategyVO creatMarketVoucherStrategyVO(){
		return new MarketVoucherStrategyVO(start, end, sum, rebate);
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
