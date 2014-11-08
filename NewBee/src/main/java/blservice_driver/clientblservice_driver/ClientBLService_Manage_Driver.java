package blservice_driver.clientblservice_driver;

import blservice.clientblservice.ClientBLService_Manage;
import vo.ClientVO;

public class ClientBLService_Manage_Driver {

public void drive(ClientBLService_Manage clientBLService_Manage){
	if(clientBLService_Manage.addClient(new ClientVO("id", 0, "name", "tel", "address", "postCode", "email",
			0, 0, 0, "defaultClerk"))){
		System.out.println("Add Client Successfully");
	}
	
	if(clientBLService_Manage.deleteClient("name")){
		System.out.println("Delete Client Successfully");
	}
	
	if(clientBLService_Manage.modifyClient("name", new ClientVO("id", 0, "name", "tel", "address", "postCode", "email",
			0, 0, 0, "defaultClerk"))){
		System.out.println("Modify Client Successfully");
	}
	
	if(clientBLService_Manage.search("info").add(null)){
		System.out.println("Search Client Successfully");
	}
}

}
