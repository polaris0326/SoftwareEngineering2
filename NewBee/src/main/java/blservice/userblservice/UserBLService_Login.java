package blservice.userblservice;

import vo.UserVO;

public interface UserBLService_Login {
	public UserVO PWVerify(String name,String password);
	//登录验证

}
