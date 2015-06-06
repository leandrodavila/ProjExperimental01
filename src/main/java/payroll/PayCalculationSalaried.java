package payroll;

import entity.Employee;
import entity.SalariedEmployee;

public class PayCalculationSalaried extends PayrollCalculation {

	public PayCalculationSalaried(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getGrossPayment() {
		
		SalariedEmployee salariedEmployee = (SalariedEmployee) this.employee;
		
		return salariedEmployee.getWeeklySalary() * 4;
	}

}
