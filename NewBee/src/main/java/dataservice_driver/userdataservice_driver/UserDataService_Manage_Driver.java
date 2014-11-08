package dataservice_driver.userdataservice_driver;

import dataservice.userdataservice.UserDataService_Manage;
import po.UserPO;

public class UserDataService_Manage_Driver{
	public void drive(UserDataService_Manage userDataService_Manage){
		userDataService_Manage.insert(new UserPO(null, null, null));
		
		
		userDataService_Manage.delete("abc");
		
		
		userDataService_Manage.update(new UserPO(null, null, null));
	
		
		userDataService_Manage.find("Xyz");
		System.out.println("Find Successfully");
		
		userDataService_Manage.getUserList();
		System.out.println("Get Userlist Successfully");
	}
	
}
