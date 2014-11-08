package vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import po.ClientRebateStrategyPO;

public class ClientRebateStrategyVO extends StrategyVO  implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ClientRebateStrategyVO(Date start, Date end, int level,
			double rebate, ArrayList<String> alreadyPresentedClient) {
		super(start, end);
		this.level = level;
		this.rebate = rebate;
		this.alreadyPresentedClient = alreadyPresentedClient;
	}
	
	public ClientRebateStrategyPO creatPO(){
		return new ClientRebateStrategyPO(start,end,level,
				rebate,alreadyPresentedClient);
	}
	
	int level;
	double rebate;
	ArrayList<String> alreadyPresentedClient;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getRebate() {
		return rebate;
	}
	public void setRebate(double rebate) {
		this.rebate = rebate;
	}
	public ArrayList<String> getAlreadyPresentedClient() {
		return alreadyPresentedClient;
	}
	public void setAlreadyPresentedClient(ArrayList<String> alreadyPresentedClient) {
		this.alreadyPresentedClient = alreadyPresentedClient;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
