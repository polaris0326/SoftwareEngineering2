package vo;

import java.io.Serializable;

import po.CommodityPO;

public class CommodityVO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CommodityVO(String id, String name, String model, int amount,
			double defaultPurchasePrice, double defaultSellingPrice,
			double recentPurchasePrice, double recentSellingPrice) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.amount = amount;
		this.defaultPurchasePrice = defaultPurchasePrice;
		this.defaultSellingPrice = defaultSellingPrice;
		this.recentPurchasePrice = recentPurchasePrice;
		this.recentSellingPrice = recentSellingPrice;
	}
	String id;
	String name;
	String model;
	int amount;
	double defaultPurchasePrice;
	double defaultSellingPrice;
	double recentPurchasePrice;
	double recentSellingPrice;
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
	public double getDefaultPurchasePrice() {
		return defaultPurchasePrice;
	}
	public void setDefaultPurchasePrice(double defaultPurchasePrice) {
		this.defaultPurchasePrice = defaultPurchasePrice;
	}
	public double getDefaultSellingPrice() {
		return defaultSellingPrice;
	}
	public void setDefaultSellingPrice(double defaultSellingPrice) {
		this.defaultSellingPrice = defaultSellingPrice;
	}
	public double getRecentPurchasePrice() {
		return recentPurchasePrice;
	}
	public void setRecentPurchasePrice(double recentPurchasePrice) {
		this.recentPurchasePrice = recentPurchasePrice;
	}
	public double getRecentSellingPrice() {
		return recentSellingPrice;
	}
	public void setRecentSellingPrice(double recentSellingPrice) {
		this.recentSellingPrice = recentSellingPrice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CommodityPO createPO() {
		return new CommodityPO(id,name,model,amount,
				defaultPurchasePrice,defaultSellingPrice,
				 recentPurchasePrice, recentSellingPrice);
	}
	

}
