package po;

import java.util.ArrayList;
import java.util.Date;

import vo.ClientRebateStrategyVO;

public class ClientRebateStrategyPO extends StrategyPO{
	
	
	
	public ClientRebateStrategyPO(Date start, Date end, int level,
			double rebate, ArrayList<String> alreadyPresentedClient) {
		super(start, end);
		this.level = level;
		this.rebate = rebate;
		this.alreadyPresentedClient = alreadyPresentedClient;
	}
	public ClientRebateStrategyVO creatClientRebateStrategyVO(){
		return new ClientRebateStrategyVO(start, end, level, rebate, alreadyPresentedClient);
	}
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
	int level;
	double rebate;
	ArrayList<String> alreadyPresentedClient;

}
