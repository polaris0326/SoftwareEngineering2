package po;
import vo.UserVO;
import enums.UserType;

public class UserPO {
	
	public UserPO(UserType type, String name, String password) {
		super();
		this.type = type;
		this.name = name;
		this.password = password;
	}
	public UserVO creatUserVO(){
		return new UserVO(type, name, password);
	}
	
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	UserType type;
	String name;
	String password;

}
