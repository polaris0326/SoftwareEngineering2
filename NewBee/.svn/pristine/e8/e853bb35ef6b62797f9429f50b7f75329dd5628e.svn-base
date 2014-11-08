package vo;

import java.io.Serializable;

import po.DealItemPO;

public class DealItemVO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DealItemVO(String id, String name, String model, int amount,
			double unit, String comment) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.amount = amount;
		this.unit = unit;
		this.comment = comment;
		sum=unit*amount;
	}
	
	public DealItemPO createPO(){
		return new DealItemPO(id, name, model, amount, unit, comment);
	}
	
	String id;
	String name;
	String model;
	int amount;
	double unit;
	double sum;
	String comment;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
