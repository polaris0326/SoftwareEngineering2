package dataservice_driver.cilentdataservice_driver;
//
import po.ClientPO;
import dataservice.clientdataservice.ClientDataService_Manage;

public class ClientDataService_Manage_Driver {

	public void drive(ClientDataService_Manage clientDataService_Manage){
		if(clientDataService_Manage.search("info").add(null)){
			System.out.println("Search successfully");
		}
		
		if(clientDataService_Manage.insert(new ClientPO("id", 0, "name", "tel",
				"address", "postCode", "email",
				0,0,0,"defaultClerk"))){
			System.out.println("Insert successfully");
		}
		
		if(clientDataService_Manage.delete("name")){
			System.out.println("Delete successfully");
		}
		
		if(clientDataService_Manage.update("name", new ClientPO("id", 0, "name", "tel",
				"address", "postCode", "email",
				0,0,0,"defaultClerk"))){
			System.out.println("Update successfully");
		}
	}
}
