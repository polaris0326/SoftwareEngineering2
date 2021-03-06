package blservice_driver.userblservice_driver;

import enums.UserType;
import blservice.userblservice.UserBLService_Manage;
import vo.UserVO;

public class UserBLService_Manage_Driver{
	
	public void drive(UserBLService_Manage userBLService_Manage) {
		if(userBLService_Manage.addUser(new UserVO(UserType.STORAGEMANAGER, "abc", "123")))
			System.out.println("Add User Successfully");
		
		if(userBLService_Manage.deleteUser("abc"))
			System.out.println("Delete User Successfully");
		
		if(userBLService_Manage.modifyUser(new UserVO(UserType.STORAGEMANAGER, "abc", "1234")))
			System.out.println("Modify User Successfully");
		
		if(userBLService_Manage.getUserList().add(null))
			System.out.println("Get Userlist Successfully");
		
	}


}
