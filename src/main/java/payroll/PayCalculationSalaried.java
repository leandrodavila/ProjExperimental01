package payroll;

import entity.Employee;
import entity.SalariedEmployee;

public class PayCalculationSalaried extends PayrollCalculation {

	public PayCalculationSalaried(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getEarnings(Employee employee) {
		
		SalariedEmployee salariedEmployee = (SalariedEmployee) employee;
		
		return salariedEmployee.getWeeklySalary() * 4;
	}

}
