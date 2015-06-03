package dao;

import java.util.ArrayList;
import java.util.List;

import entity.BasePlusCommissionEmployee;
import entity.CommissionEmployee;
import entity.Employee;
import entity.HourlyEmployee;
import entity.SalariedEmployee;

public class EmployeeDAO {
	
	public List<Employee> getAllEmployees() {
		
		List<Employee> list = new ArrayList<Employee>();
		
		SalariedEmployee          salariedEmployee            = new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
		list.add(salariedEmployee);
		
	    HourlyEmployee            hourlyEmployee              = new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40 );
	    list.add(hourlyEmployee);
	    
	    CommissionEmployee        commissionEmployee          = new CommissionEmployee( "Sue", "Jones", "333-33-3333", 10000, .06 );
	    list.add(commissionEmployee);
	    
	    BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee( "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );
		list.add(basePlusCommissionEmployee);
		
		
		return list;
		
	}
	
	public List<CommissionEmployee> getCommissionEmployees() {
		
		List<CommissionEmployee> list = new ArrayList<CommissionEmployee>();
		
		return list;
		
	}

}
