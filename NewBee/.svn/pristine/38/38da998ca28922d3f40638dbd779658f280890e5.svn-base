package po;

import java.util.ArrayList;
import java.util.Date;

import vo.PackVO;

public class PackPO extends CommodityPO{
	
	public PackPO(String name, ArrayList<ComAmountItemPO> items, Date start, Date end,
			double price) {
		super("SPECIAL","特价包",name,999,price,0,price,0);
		this.items = items;
		this.start = start;
		this.end = end;
		this.price = price;
	}
	public PackVO creatPackVO(){
		return new PackVO(name, items, start, end, price);
	}
	
	ArrayList<ComAmountItemPO> items;
	public ArrayList<ComAmountItemPO> getItems() {
		return items;
	}
	public void setItems(ArrayList<ComAmountItemPO> items) {
		this.items = items;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	Date start;
	Date end;
	double price;

}
