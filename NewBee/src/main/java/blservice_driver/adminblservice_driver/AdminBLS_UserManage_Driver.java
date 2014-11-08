package blservice_driver.adminblservice_driver;

import enums.UserType;
import blservice.adminblservice.AdminBLS_UserManage;
import vo.UserVO;

public class AdminBLS_UserManage_Driver{
	
	public void drive(AdminBLS_UserManage adminBLS_UserManage){
		if(adminBLS_UserManage.addUser(new UserVO(UserType.STORAGEMANAGER, "abc", "123")))
			System.out.println("Add User Successfully");
		
		if(adminBLS_UserManage.modifyUser(new UserVO(UserType.STORAGEMANAGER, "abc", "123")))
			System.out.println("Modify User Successfully");
		
		if(adminBLS_UserManage.deleteUser("abc")){
			System.out.println("Delete User Successfully");
		}
		
		if(adminBLS_UserManage.getUserList().add(null)){
			System.out.println("Get Userlist Successfully");
		}
		
	}

}
