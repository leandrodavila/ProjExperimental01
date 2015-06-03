package payroll;

import entity.Employee;

public class PayrollCalculationFactory {
	
    private static PayrollCalculationFactory INSTANCE;
    
    public static PayrollCalculationFactory getInstance(){
    	
    	if ( PayrollCalculationFactory.INSTANCE == null ) {
    		
    		PayrollCalculationFactory.INSTANCE = new PayrollCalculationFactory();
    		
    	} 
    	
    	return PayrollCalculationFactory.INSTANCE;
    	
    }
    
    public IPayrollCalculation getPayrollCalculation (Employee employee) {
    	
    	IPayrollCalculation payrollCalculation = null;
    	
    	if (employee.getTypeContract() == Employee.SALARIED_EMPLOYEE)
    		payrollCalculation = new PayCalculationSalaried(employee);
    	
    	else if (employee.getTypeContract() == Employee.HOURLY_EMPLOYEE)
    		payrollCalculation = new PayCalculationHourly(employee);
    	
    	else if (employee.getTypeContract() == Employee.COMMISSION_EMPLOYEE)
    		payrollCalculation = new PayCalculationCommission(employee);
    	
    	else if (employee.getTypeContract() == Employee.BASEPLUS_COMMISSION_EMPLOYEE)
    		payrollCalculation = new PayCalculationBasePlusCommission(employee);
    	
    	return payrollCalculation;
    }


}
