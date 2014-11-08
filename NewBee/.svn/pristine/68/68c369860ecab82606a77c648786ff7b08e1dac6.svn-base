package blservice.adminblservice;

import java.util.ArrayList;

import vo.UserVO;

public interface AdminBLService {
	
	public boolean addUser(UserVO vo);
	public boolean modifyUser(UserVO vo);
	public boolean deleteUser(String name);
	
	public ArrayList<UserVO> getUserList();
	public UserVO findUser(String name);
	
	public boolean changeAdminPW(String oldPW, String newPW);
	//检查旧管理员密码是否正确，若正确，更新为新密码，并返回修改成功与否

}
