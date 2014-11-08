package blservice_stub.adminblservice_stub;

import blservice.adminblservice.AdminBLS_ChangePW;

public class AdminBLS_ChangePW_Stub implements AdminBLS_ChangePW{
	
	public boolean changePW(String oldPW, String newPW){
	//检查旧管理员密码是否正确，若正确，更新为新密码，并返回修改成功与否
		return true;
	}

}
