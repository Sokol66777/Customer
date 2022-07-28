package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {
	
	public List <Customer> interval(List<Customer> cstms ,int start,int end){
		List <Customer> interval = new ArrayList<>();
		for(Customer cstm:cstms) {
			if(cstm.getKardNumber()>=start && cstm.getKardNumber()<=end) {
				interval.add(cstm);
			}
		}
		
		return interval;
	}
}
