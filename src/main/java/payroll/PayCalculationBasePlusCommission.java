package payroll;

import entity.BasePlusCommissionEmployee;
import entity.Employee;

public class PayCalculationBasePlusCommission extends PayrollCalculation {

	public PayCalculationBasePlusCommission(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getGrossPayment(){
		
		BasePlusCommissionEmployee e = ( BasePlusCommissionEmployee ) this.employee; 
		
		return e.getBaseSalary() + ( e.getCommissionRate() * e.getGrossSales() );

	}

}
