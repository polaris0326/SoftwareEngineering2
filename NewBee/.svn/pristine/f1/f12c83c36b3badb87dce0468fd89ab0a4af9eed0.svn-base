package po;

import vo.ClientVO;

public class ClientPO {
	
	
	public ClientPO(String id, int level, String name, String tel,
			String address, String postCode, String email,
			double receivableLimit, double payable, double receivable,
			String defaultClerk) {
		super();
		this.id = id;
		this.level = level;
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.postCode = postCode;
		this.email = email;
		this.receivableLimit = receivableLimit;
		this.payable = payable;
		this.receivable = receivable;
		this.defaultClerk = defaultClerk;
	}
	public ClientVO creatClientVO(){
		return new ClientVO(id, level, name, tel, address, postCode, email, receivableLimit, payable, receivable, defaultClerk);
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getReceivableLimit() {
		return receivableLimit;
	}
	public void setReceivableLimit(double receivableLimit) {
		this.receivableLimit = receivableLimit;
	}
	public double getPayable() {
		return payable;
	}
	public void setPayable(double payable) {
		this.payable = payable;
	}
	public double getReceivable() {
		return receivable;
	}
	public void setReceivable(double receivable) {
		this.receivable = receivable;
	}
	public String getDefaultClerk() {
		return defaultClerk;
	}
	public void setDefaultClerk(String defaultClerk) {
		this.defaultClerk = defaultClerk;
	}

	String id=null;
	int level;
	//销售商level为0，五级进货商分别为1-5
	String name;
	String tel;
	String address;
	String postCode;
	String email;
	double receivableLimit;
	//应收额度，销售商为0
	double payable;
	double receivable;
	String defaultClerk;

}
