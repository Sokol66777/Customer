package by.epam.tr.main;

import java.util.Comparator;

public class SortByName implements Comparator<Customer>{

	@Override
	public int compare(Customer cstm1, Customer cstm2) {
		
		return cstm1.getName().compareTo(cstm2.getName());
	}

}
