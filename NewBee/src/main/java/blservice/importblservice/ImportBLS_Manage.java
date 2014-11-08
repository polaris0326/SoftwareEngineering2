package blservice.importblservice;

import java.util.ArrayList;

import vo.ImportBillVO;

public interface ImportBLS_Manage {
	
	public ArrayList<ImportBillVO> getImportRecord();
	public  boolean deleteImport(String id);
	
	//我们设计的是：进货人员进入进货界面，展示最近一段时间的进货记录，他可以选中一个进货记录然后点击退货，也可以手动输入对应的进货记录编号进行退货
	//新建进货，需要在此界面上点击另一个按钮，弹出一个界面，在那个界面上展示商品和客户列表供其选择

}
