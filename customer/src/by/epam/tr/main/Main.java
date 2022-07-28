package by.epam.tr.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> cstms=new ArrayList<Customer>();
		cstms.add(new Customer( 2, "Pety", "Petin", "Petovich", 175938, "Home2", 000002));
		cstms.add(new Customer( 1, "Igor", "Igorin", "Igorovich", 178487, "Home1", 000001));
		cstms.add(new Customer( 7, "Anton", "Antonov", "Antonovich", 175533, "Home7", 000007));
		cstms.add(new Customer( 4, "Vitaly", "Vitalin", "Vitalevich", 175654, "Home4", 000004));
		cstms.add(new Customer( 3, "Phedor", "Phedorov", "Phedorovich", 175457, "Home3", 000003));
		
		Collections.sort(cstms, new SortByName());
		
		for(Customer cstm : cstms) {
			System.out.println(cstm.getName());
		}
		
		CustomerLogic cstmLog = new CustomerLogic();
		List<Customer> interval = cstmLog.interval(cstms, 175600, 179000);
		for(Customer cstm:interval) {
			System.out.println(cstm.toString());
		}
		
	}

}
