package entity;
// Fig. 10.13: Employee.java
// Employee abstract superclass implements Payable.

public abstract class Employee  {
	
	public final static int SALARIED_EMPLOYEE            = 1;
	public final static int HOURLY_EMPLOYEE              = 2;
    public final static int COMMISSION_EMPLOYEE          = 3;
    public final static int BASEPLUS_COMMISSION_EMPLOYEE = 4;	
	
    private   String firstName;
    private   String lastName;
    private   String socialSecurityNumber;
    protected int    typeContract;

   // three-argument constructor
   public Employee( String first, String last, String ssn )
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
   } // end three-argument Employee constructor

   // set first name
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber
   
   public int getTypeContract() {
	   
	   return this.typeContract;
	   
   }
   
   public String getTypeContractText() {
	   
	   String typeContractText = "";
	   
	   
	    switch ( this.typeContract ) {
	    
	       case SALARIED_EMPLOYEE: 
	    	   typeContractText = "Salaried";
		       break;
		       					   
	       case HOURLY_EMPLOYEE: 
	    	   typeContractText = "Hourly";
		       break;
		       
	       case COMMISSION_EMPLOYEE: 
	    	   typeContractText = "Commission";
		       break;
		       
	       case BASEPLUS_COMMISSION_EMPLOYEE: 
	    	   typeContractText = "Base Plus Commission";
		       break;

	       default: 
	    	   typeContractText = "Invalid Contract";
	    	   break;
	    }
	    
	    return typeContractText;
	   
   }


   // return String representation of Employee object
   public String toString()
   {
      return String.format( "%s %s\nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber() );
   } // end method toString

	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}


   // Note: We do not implement Payable method getPaymentAmount here so  
   // this class must be declared abstract to avoid a compilation error.
} // end abstract class Employee


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
