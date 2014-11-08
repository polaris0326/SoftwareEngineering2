package blservice.accountblservice;

import java.util.Date;
import java.util.ArrayList;

import vo.BillVO;

public interface AccountBLService_BillHistory {
	
	//这个通过billblservice的Info_Search接口，拿到PO并转换成VO传递给ui
	public ArrayList<BillVO> billHistory(Date d1, Date d2, String billType, 
			String clientName, String clerkName, String storage);
	
	//单据红冲，根据单据编号，通过Info_Search接口内的find方法找到原单据，将其中相关数量取负new出红冲单据。若红冲修改，利用修改信息生成修改后的红冲单据，
	//通过billblservice的BillEntrance接口完善其单据编号，最终加入billdata
	
	//amount为报溢报损数量。不发生修改的话，amount即为原数量的负数。若发生修改，amount即为修改后的数量。若正负性与被红冲单据不相反，则返回false。若红冲会导致库存数量为负数，则返回false
	//设置警戒线 不能红冲
	public boolean writeOff_ComCorrect(String billID, int amount);
	
	//进货、销售单红冲时，只能修改一种或多种商品的数量，不能修改单价。销售单的赠品数量取负后不能修改，折扣和代金券数量取负后不能修改。
	//changedItem标识了第几项商品发生了修改（从0计数），changedAmount记录了修改的数量。若有任何一个数量为非负数，返回false
	//若红冲无修改，两个list为null
	public boolean writeOff_Deal(String billID, ArrayList<Integer> changedItem, ArrayList<Integer> changedAmount);
	
	//收付款单、现金费用单红冲时，只能修改每个账户的转账金额或每个现金费用条目的金额。若收款红冲会导致任何账户余额为负数或现金费用单总费用会导致付款账户余额为负数，返回false
	public boolean writeOff_Finance(String billID, ArrayList<Integer> changedItem, ArrayList<Integer> changedAmount);
	
	public void billHistoryExportExcel();

}
