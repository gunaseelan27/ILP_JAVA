package Operations;

import java.util.List;
import java.util.Map;

import Data.*;

public class ByService {
	
	BookingHistroy R = new BookingHistroy();
	RegisteredUsers US = new RegisteredUsers();
	List<Map<String,String>> Users = US.getCustomers();
	public void getUsers(String service) {
		int found = 0;
		for(Map<String,String> k : R.BookingRecords()) {
			if(k.get("serviceType").toLowerCase().contains(service.toLowerCase())) {
				System.out.println("User Id:"+k.get("userId"));
				for(Map<String,String> m : US.getCustomers()) {
					if(k.get("userId").equals(m.get("userId"))) {
						System.out.println("Customer Name:"+m.get("name"));
						break;
					}
				}
				
				System.out.println("Service Type :"+k.get("serviceType"));
				System.out.println("Service: "+k.get("subService"));
				System.out.println("Phone Number: "+k.get("contact"));
				System.out.println("Address: "+k.get("address"));
				System.out.println("---------------------------------------------------");
				found++;
				
			}
		}
		if(found ==0) {
			System.out.println("No Such Customers Exist with the Given phone number");
		}

}

}
