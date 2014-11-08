package vo;

import java.io.Serializable;

public class BusinessConditionVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessConditionVO(double salesRevenue, double comRevenue,
			double allRebate, double salesExpense, double comExpense) {
		super();
		this.salesRevenue = salesRevenue;
		this.comRevenue = comRevenue;
		this.allRebate = allRebate;
		this.afterRebateRevenue = salesRevenue + comRevenue - allRebate;
		this.salesExpense = salesExpense;
		this.comExpense = comExpense;
		this.allExpense = salesExpense + comExpense;
		this.profit = afterRebateRevenue - allExpense;
	}

	double salesRevenue;
	double comRevenue;
	double allRebate;
	double afterRebateRevenue;

	double salesExpense;
	double comExpense;
	double allExpense;

	double profit;

	public double getSalesRevenue() {
		return salesRevenue;
	}

	public void setSalesRevenue(double salesRevenue) {
		this.salesRevenue = salesRevenue;
	}

	public double getComRevenue() {
		return comRevenue;
	}

	public void setComRevenue(double comRevenue) {
		this.comRevenue = comRevenue;
	}

	public double getAllRebate() {
		return allRebate;
	}

	public void setAllRebate(double allRebate) {
		this.allRebate = allRebate;
	}

	public double getAfterRebateRevenue() {
		return afterRebateRevenue;
	}

	public void setAfterRebateRevenue(double afterRebateRevenue) {
		this.afterRebateRevenue = afterRebateRevenue;
	}

	public double getSalesExpense() {
		return salesExpense;
	}

	public void setSalesExpense(double salesExpense) {
		this.salesExpense = salesExpense;
	}

	public double getComExpense() {
		return comExpense;
	}

	public void setComExpense(double comExpense) {
		this.comExpense = comExpense;
	}

	public double getAllExpense() {
		return allExpense;
	}

	public void setAllExpense(double allExpense) {
		this.allExpense = allExpense;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
