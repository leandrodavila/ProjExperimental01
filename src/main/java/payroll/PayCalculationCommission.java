package payroll;

import entity.CommissionEmployee;
import entity.Employee;

public class PayCalculationCommission extends PayrollCalculation  {

	public PayCalculationCommission(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getEarnings(Employee employee) {
		
		CommissionEmployee commissionEmployee = ( CommissionEmployee ) employee;
		
		return commissionEmployee.getCommissionRate() * commissionEmployee.getGrossSales();
	}

}
