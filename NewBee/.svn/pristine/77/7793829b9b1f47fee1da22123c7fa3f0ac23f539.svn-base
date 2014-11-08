package vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import po.ClientVoucherStrategyPO;

public class ClientVoucherStrategyVO extends StrategyVO implements Serializable{



	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ClientVoucherStrategyVO(Date start, Date end, int level,
			double voucher, ArrayList<String> alreadyPresentedClient) {
		super(start, end);
		this.level = level;
		this.voucher = voucher;
		this.alreadyPresentedClient = alreadyPresentedClient;
	}
	
	public ClientVoucherStrategyPO createPO(){
		return new ClientVoucherStrategyPO(start,end,level,
				voucher,alreadyPresentedClient);
	}
	int level;
	double voucher;
	ArrayList<String> alreadyPresentedClient;
	//每个客户只能领取一次，故需要保存已经赠送过的客户
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
