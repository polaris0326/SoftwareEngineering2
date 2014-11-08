package dataservice_stub.userdataservice_stub;

import java.util.ArrayList;

import dataservice.userdataservice.UserDataService_Manage;
import enums.UserType;
import po.UserPO;

public class UserDataService_Manage_Stub implements UserDataService_Manage{
	public void insert(UserPO po){
		System.out.println("Insert Successfully");
	}
	public void delete(String name){
		System.out.println("Delete Successfully");
	}
	public void update(UserPO po){
		System.out.println("Update Successfully");
	}
	public UserPO find(String name){
	//增删改查
		return new UserPO(UserType.STORAGEMANAGER, "abc", "123");
	}
	public ArrayList<UserPO> getUserList(){
	//获取用户列表
		return new ArrayList<UserPO>();
	}
	
}
