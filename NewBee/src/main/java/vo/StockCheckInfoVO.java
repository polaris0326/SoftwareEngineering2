package vo;

import java.io.Serializable;

public class StockCheckInfoVO  implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	public StockCheckInfoVO(String id, String name, String model, int amountIn,
			int amountOut, int totalIn, int totalOut) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.amountIn = amountIn;
		this.amountOut = amountOut;
		this.totalIn = totalIn;
		this.totalOut = totalOut;
	}
	
	String id;
	String name;
	String model;
	
	int amountIn;
	int amountOut;
	int totalIn;
	int totalOut;
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
	public int getAmountIn() {
		return amountIn;
	}
	public void setAmountIn(int amountIn) {
		this.amountIn = amountIn;
	}
	public int getAmountOut() {
		return amountOut;
	}
	public void setAmountOut(int amountOut) {
		this.amountOut = amountOut;
	}
	public int getTotalIn() {
		return totalIn;
	}
	public void setTotalIn(int totalIn) {
		this.totalIn = totalIn;
	}
	public int getTotalOut() {
		return totalOut;
	}
	public void setTotalOut(int totalOut) {
		this.totalOut = totalOut;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
}
