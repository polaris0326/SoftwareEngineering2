package blservice_stub.userblservice_stub;

import java.util.ArrayList;

import blservice.userblservice.UserBLService_Manage;
import vo.UserVO;

public class UserBLService_Manage_Stub implements UserBLService_Manage{
	public boolean addUser(UserVO vo){
	//添加用户
		return true;
	}
	public boolean deleteUser(String name){
	//删除用户
		return true;
		//System.out.println("Success!");
	}
	public boolean modifyUser (UserVO vo){
	//修改用户
		return true;
	}
	public ArrayList<UserVO> getUserList(){
	//获取userList
		return new ArrayList<UserVO>();
	}
}
