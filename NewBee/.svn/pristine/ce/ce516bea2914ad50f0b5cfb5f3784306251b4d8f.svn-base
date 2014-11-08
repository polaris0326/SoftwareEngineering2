package po;

import java.util.ArrayList;
import java.util.Date;

import vo.ClientVoucherStrategyVO;

public class ClientVoucherStrategyPO extends StrategyPO{
	
	
	
	public ClientVoucherStrategyPO(Date start, Date end, int level,
			double voucher, ArrayList<String> alreadyPresentedClient) {
		super(start, end);
		this.level = level;
		this.voucher = voucher;
		this.alreadyPresentedClient = alreadyPresentedClient;
	}
	public ClientVoucherStrategyVO creatClientVoucherStrategyVO(){
		return new ClientVoucherStrategyVO(start, end, level, voucher, alreadyPresentedClient);
	}
	int level;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getVoucher() {
		return voucher;
	}
	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}
	public ArrayList<String> getAlreadyPresentedClient() {
		return alreadyPresentedClient;
	}
	public void setAlreadyPresentedClient(ArrayList<String> alreadyPresentedClient) {
		this.alreadyPresentedClient = alreadyPresentedClient;
	}
	double voucher;
	ArrayList<String> alreadyPresentedClient;
	//每个客户只能领取一次，故需要保存已经赠送过的客户

}
