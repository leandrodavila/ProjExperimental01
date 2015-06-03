package payroll;

import entity.Employee;
import entity.HourlyEmployee;

public class PayCalculationHourly extends PayrollCalculation {

	public PayCalculationHourly(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getEarnings(Employee employee) {
		
		HourlyEmployee hourlyEmployee = ( HourlyEmployee) employee;
		
	    if ( hourlyEmployee.getHours() <= 40 ) // no overtime
	        return hourlyEmployee.getWage() * hourlyEmployee.getHours();
	    else
	        return 40 * hourlyEmployee.getWage() + ( hourlyEmployee.getHours() - 40 ) * hourlyEmployee.getWage() * 1.5;
		
	}

}
