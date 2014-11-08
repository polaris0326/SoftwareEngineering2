package vo;

import java.io.Serializable;

import po.UserPO;
import enums.UserType;

public class UserVO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserVO(UserType type, String name, String password) {
		super();
		this.type = type;
		this.name = name;
		this.password = password;
	}
	
	public UserPO createPO(){
		return new UserPO(type,name, password);
	}
	
	UserType type;
	String name;
	String password;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
