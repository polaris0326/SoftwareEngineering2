package po;

import java.util.ArrayList;
import java.util.Date;

import vo.CashBillVO;
import vo.CashItemVO;
import enums.BillState;

public class CashBillPO extends BillPO{
	
	
	public CashBillPO(String id, Date submitDate, String submitUser,
			BillState state, String user, String accountName,
			ArrayList<CashItemPO> reasons, double sum) {
		super(id, submitDate, submitUser, state);
		this.user = user;
		this.accountName = accountName;
		this.reasons = reasons;
		this.sum = sum;
	}
	public CashBillVO creatCashBillVO(){
		ArrayList<CashItemVO> reasonsVO =new ArrayList<CashItemVO>();
		for(CashItemPO ci:reasons){
			reasonsVO.add(ci.creatCashItemVO());
		}
		return new CashBillVO(id, submitDate, user, state, accountName, reasonsVO, sum);
	}
	String user;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public ArrayList<CashItemPO> getReasons() {
		return reasons;
	}
	public void setReasons(ArrayList<CashItemPO> reasons) {
		this.reasons = reasons;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	String accountName;
	ArrayList<CashItemPO> reasons;
	double sum;

}
