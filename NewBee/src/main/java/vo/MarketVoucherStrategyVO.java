package vo;

import java.io.Serializable;
import java.util.Date;

public class MarketVoucherStrategyVO extends StrategyVO implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MarketVoucherStrategyVO(Date start, Date end, double sum,
			double rebate) {
		super(start,end);
		this.sum = sum;
		this.rebate = rebate;
	}
	
	double sum;
	double rebate;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
