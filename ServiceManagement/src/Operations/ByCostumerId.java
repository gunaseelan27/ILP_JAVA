package Operations;
import java.util.Map;

import Data.*;
public class ByCostumerId {
	
	RegisteredUsers R = new RegisteredUsers();
	public void getUsers(String id) {
		int found = 0;
		for(Map<String,String> k : R.getCustomers()) {
			if(k.get("userId").equals(id)) {
				System.out.println("User Id:"+k.get("userId"));
				System.out.println("Customer Name:"+k.get("name"));
				System.out.println("Email: "+k.get("email"));
				System.out.println("Phone Number: "+k.get("contact"));
				System.out.println("Address: "+k.get("address"));
				found++;
				return;
			}
		}
		if(found ==0) {
			System.out.println("No Such Customers Exist with the Given Customer Id");
		}
		
//		System.out.println("byid");
	}

}
