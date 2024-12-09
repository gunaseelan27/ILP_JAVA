package Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingHistroy {
	
	public List<Map<String,String>> Bookings = Arrays.asList(
			new HashMap<>() {{
				put("userId","id123");
				put("serviceType","House Cleaning");
				put("subService","3 BHK");
				put("date","12/12/2024");
				put("address","No 16,Nehru street,Navalur");
				put("contact","8754378059");
				put("vendor","Sathya Agencies");
				put("amount","1000");
				put("serviceId","ser244");
			}},
			
			new HashMap<>() {{
				put("userId","id123");
				put("serviceType","House Cleaning");
				put("subService","Bathroom Cleaning");
				put("date","14/12/2024");
				put("address","No 16,Nehru street,Navalur");
				put("contact","8754378059");
				put("vendor","Sathya Agencies");
				put("amount","1000");
				put("serviceId","ser245");
			}},
			
			new HashMap<>() {{
				put("userId","id313");
				put("serviceType","AC & Appliances");
				put("subService","TV Repair");
				put("date","24/12/2024");
				put("address","No 2,vijaya nagar,pallavaram,chennai");
				put("contact","992212389");
				put("vendor","Here For U");
				put("amount","800");
				put("serviceId","ser246");
			}},
			
			new HashMap<>() {{
				put("userId","id456");
				put("serviceType","AC & Appliances");
				put("subService","Fridge Repair");
				put("date","11/12/2024");
				put("address","No 16,Anna nagar,chennai");
				put("contact","6385946584");
				put("vendor","Mr Service");
				put("amount","1500");
				put("serviceId","ser247");
			}},
			
			new HashMap<>() {{
				put("userId","id456");
				put("serviceType","AC & Appliances");
				put("subService","Washing Machine Repair");
				put("date","11/12/2024");
				put("address","No 16,Anna nagar,chennai");
				put("contact","6385946584");
				put("vendor","Mr Service");
				put("amount","1500");
				put("serviceId","ser248");			
				}},
			
			new HashMap<>() {{
				put("userId","id123");
				put("serviceType","House Cleaning");
				put("subService","Bathroom Cleaning");
				put("date","26/12/2024");
				put("address","No 16,Nehru street,Navalur");
				put("contact","8754378059");
				put("vendor","Sathya Agencies");
				put("amount","1000");
				put("serviceId","ser249");
			}},
			
			new HashMap<>() {{
				put("userId","id789");
				put("serviceType","Product pickup and drop");
				put("subService","Furnitures");
				put("date","10/12/2024");
				put("address","No 7,Kovil street,Tambaram,chennai");
				put("contact","8608136818");
				put("vendor","AtLas Service");
				put("amount","2000");
				put("serviceId","ser250");
			}},
			
			new HashMap<>() {{
				put("userId","id789");
				put("serviceType","Product pickup and drop");
				put("subService","Vehicle");
				put("date","20/12/2024");
				put("address","No 7,Kovil street,Tambaram,chennai");
				put("contact","8608136818");
				put("vendor","Mr Service");
				put("amount","1500");
				put("serviceId","ser251");
			}},
			
			new HashMap<>() {{
				put("userId","id222");
				put("serviceType","Vehicle Repair");
				put("subService","Two Wheeler");
				put("date","09/12/2024");
				put("address","No 12/A,Sunrise Apartment,Chepak,chennai");
				put("contact","8723411090");
				put("vendor","Sathya Agencies");
				put("amount","1000");
				put("serviceId","ser252");
			}},
			
			new HashMap<>() {{
				put("userId","id222");
				put("serviceType","Vehicle Repair");
				put("subService","Four Wheeler");
				put("date","11/12/2024");
				put("address","No 12/A,Sunrise Apartment,Chepak,chennai");
				put("contact","8723411090");
				put("vendor","Sathya Agencies");
				put("amount","1000");
				put("serviceId","ser253");
			}},
			
			new HashMap<>() {{
				put("userId","id313");
				put("serviceType","AC & Appliances");
				put("subService","AC Repair");
				put("date","15/12/2024");
				put("address","No 2,vijaya nagar,pallavaram,chennai");
				put("contact","992212389");
				put("vendor","Mr Service");
				put("amount","1500");
				put("serviceId","ser254");
			}},
			
			new HashMap<>() {{
				put("userId","id123");
				put("serviceType","AC & Appliances");
				put("subService","Washing Machine Repair");
				put("date","19/12/2024");
				put("address","No 16,Nehru street,Navalur");
				put("contact","8754378059");
				put("vendor","Sathya Agencies");
				put("amount","1000");
				put("serviceId","ser255");
			}},
			
			new HashMap<>() {{
				put("userId","id222");
				put("serviceType","House Cleaning");
				put("subService","2 BHK");
				put("date","16/12/2024");
				put("address","No 12/A,Sunrise Apartment,Chepak,chennai");
				put("contact","8723411090");
				put("vendor","Here For U");
				put("amount","800");
				put("serviceId","ser256");			
				}},
			
			new HashMap<>() {{
				put("userId","id456");
				put("serviceType","Product pickup and drop");
				put("subService","Groceries");
				put("date","11/12/2024");
				put("address","No 16,Anna nagar,chennai");
				put("contact","6385946584");
				put("vendor","Here For U");
				put("amount","800");
				put("serviceId","ser257");
			}},
			
			new HashMap<>() {{
				put("userId","id789");
				put("serviceType","Product pickup and drop");
				put("subService","Vehicle");
				put("date","22/12/2024");
				put("address","No 7,Kovil street,Tambaram,chennai");
				put("contact","8608136818");
				put("vendor","Mr Service");
				put("amount","1500");
				put("serviceId","ser258");
			}}
			);
	
	public List<Map<String,String>> BookingRecords(){
		return Bookings;
	}

}
