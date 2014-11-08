package vo;

import java.io.Serializable;
import java.util.Date;

import po.StrategyPO;

public class StrategyVO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public StrategyVO(Date start, Date end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	public StrategyPO createPO(){
		return new StrategyPO(start, end); 
	}
	Date start;
	Date end;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
