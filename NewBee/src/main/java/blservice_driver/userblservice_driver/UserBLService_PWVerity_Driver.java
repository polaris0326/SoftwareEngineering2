package blservice_driver.userblservice_driver;

import blservice.userblservice.UserBLService_Login;

public class UserBLService_PWVerity_Driver{
	
	public void drive(UserBLService_Login userBLService_PWVerity){
		userBLService_PWVerity.PWVerify("abc", "123");
		System.out.println("Verify Passwordword Successfully");
	}


}
