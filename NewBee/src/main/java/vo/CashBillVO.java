package vo;

import java.util.ArrayList;
import java.util.Date;

import po.CashBillPO;
import po.CashItemPO;
import enums.BillState;

public class CashBillVO extends BillVO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CashBillVO(String id, Date submitDate, String submitUser,
			BillState state, String accountName, ArrayList<CashItemVO> reasons,
			double sum) {
		super(id, submitDate, submitUser, state);
		this.accountName = accountName;
		this.reasons = reasons;
		this.sum = sum;
	}
	
	public CashBillPO creatPO(){
		ArrayList<CashItemPO> pos=new ArrayList<CashItemPO>();
		for (CashItemVO vo: reasons){
			pos.add(vo.createPO());
		}
		return new CashBillPO(id,submitDate,submitUser,
				state,null,accountName,
				pos,sum);
	}
	
	String accountName;
	ArrayList<CashItemVO> reasons;
	double sum;
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public ArrayList<CashItemVO> getReasons() {
		return reasons;
	}
	public void setReasons(ArrayList<CashItemVO> reasons) {
		this.reasons = reasons;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
