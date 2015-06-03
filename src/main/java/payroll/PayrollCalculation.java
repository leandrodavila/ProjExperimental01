package payroll;

import entity.Employee;

public abstract class PayrollCalculation implements IPayrollCalculation {
	
	protected Employee employee;
	
	public PayrollCalculation (Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}
	

}
