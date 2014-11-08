package blservice.billblservice;

import java.util.ArrayList;

public interface BillBLS_Veto {

	public void vetoBill(String billID);
	public void batchVeto(ArrayList<String> ids);
}
