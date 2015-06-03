package payroll;

import java.util.List;

import dao.EmployeeDAO;
import entity.BasePlusCommissionEmployee;
import entity.CommissionEmployee;
import entity.Employee;
import entity.HourlyEmployee;
import entity.SalariedEmployee;

public class PayrollSystemTest02 {
	
   public static void main( String args[] )    {
	   
	   
	  EmployeeDAO employeeDAO = new EmployeeDAO();
	  PayrollCalculationFactory payrollCalculationFactory  = PayrollCalculationFactory.getInstance();
	  
	  List<Employee> employeeList = employeeDAO.getAllEmployees();
	
      System.out.println( "Employees processed polymorphically:\n" );
      
      // generically process each element in array employees
      for ( Employee currentEmployee : employeeList ) {
    	  
         System.out.println( currentEmployee ); // invokes toString
         
         System.out.printf( "Earned $%,.2f\n\n", payrollCalculationFactory.getPayrollCalculation(currentEmployee).getEarnings(currentEmployee));
         

      } // end for

   } // end main
} // end class PayrollSystemTest
