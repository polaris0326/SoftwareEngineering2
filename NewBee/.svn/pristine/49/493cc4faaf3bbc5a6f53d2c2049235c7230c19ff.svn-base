package blservice_stub.adminblservice_stub;

import java.util.ArrayList;

import enums.UserType;
import blservice.adminblservice.AdminBLS_UserManage;
import vo.UserVO;

public class AdminBLS_UserManage_Stub implements AdminBLS_UserManage{
	
	public boolean addUser(UserVO vo){
		if (vo.equals(new UserVO(UserType.STORAGEMANAGER, "szy", "123"))) {
			return false;
		}
		return true;
	}
	public boolean modifyUser(UserVO vo){
		return true;
	}
	public boolean deleteUser(String name){
		return true;
	}
	public ArrayList<UserVO> getUserList(){
		return new ArrayList<UserVO>();
	}

}
