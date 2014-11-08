package launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

import bl.accountbl.AccountBL_Manage;
import blservice.accountblservice.AccountBLService_Manage;
import data.accountdata.AccountData_Manage;
import po.AccountPO;
import ui.clientui.AddAccountUI;

public class Launch implements Serializable{
	
	public static void main(String []args){
		new Launch().launch();
	}
	
	public void launch(){
		
		accountLaunch();
		
	}
	
	@SuppressWarnings("unchecked")
	public void accountLaunch(){
		  try {
			  File accountFile=new File("account.nb");
			  
			  HashMap<String,AccountPO> accounts=new HashMap<String,AccountPO>();
			  
			  if (accountFile.exists()){
				  FileInputStream fis = new FileInputStream(accountFile);
				  ObjectInputStream ois = new ObjectInputStream(fis);
				  accounts=(HashMap<String,AccountPO>)ois.readObject();
				  ois.close();
			  }
			  
			  AccountData_Manage data_manage=new AccountData_Manage(accounts);
			  AccountBLService_Manage bl_manage=new AccountBL_Manage(data_manage);
			  AddAccountUI addAccountUI=new AddAccountUI(bl_manage);
			  addAccountUI.setVisible(true);
			  
			  
			  
      } catch (Exception ex) {
              ex.printStackTrace();
      }
	}

}
