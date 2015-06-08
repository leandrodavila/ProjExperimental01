package payroll;

import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDAO;
import entity.Employee;

public class PayrollCalculationService {
	
	private EmployeeDAO employeeDAO;
	private PayrollCalculationFactory payrollCalculationFactory;
	
	
	public PayrollCalculationService (){
		
		 this.employeeDAO               = new EmployeeDAO();
		 this.payrollCalculationFactory = PayrollCalculationFactory.getInstance();
		 
	}
	
    public List<EmployeeReport> getPayroll() {
    	
    	EmployeeReport currentEmployeeReport;
    	
    	List<EmployeeReport> listEmployeeReport = new ArrayList<EmployeeReport>();
    	
	    List<Employee> employeeList = employeeDAO.getAllEmployees();
	    
	    double gross_pay = 0;
		
        // generically process each element in array employees
        for ( Employee currentEmployee : employeeList ) {
        	
        	/* get GrossPayment*/
        	gross_pay = payrollCalculationFactory.getPayrollCalculation(currentEmployee).getGrossPayment();
        	
        	currentEmployeeReport = new EmployeeReport();
        	
        	currentEmployeeReport.setCompleteName( currentEmployee.getFirstName() + " " + currentEmployee.getLastName() );
        	currentEmployeeReport.setContractType( currentEmployee.getTypeContractText() );
        	currentEmployeeReport.setSsn( currentEmployee.getSocialSecurityNumber() );
        	currentEmployeeReport.setGrossPay( gross_pay );
        	
        	listEmployeeReport.add(currentEmployeeReport);
        
         
        } // end for
        
    	
    	return listEmployeeReport;
    	
    }
    
} // end class PayrollSystemTest
