package gui;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import payroll.EmployeeReport;
import payroll.PayrollCalculationService;


@SuppressWarnings("serial")
public class MainApp extends JFrame implements ActionListener {
    
    private JTextArea textArea;
    private JButton button;
    private PayrollCalculationService payrollCalculationService;
    
    public MainApp() {
        // Set the title
        super("Payroll Calculation - Projeto Experimental 01");
        
        // Set the layout. BorderLayout lets you
        // add components at the centre, north, south
        // east and west positions.
        setLayout(new BorderLayout());
        
        // We need a new text area and a new button
        // Set the text on the button to "click me"
        textArea = new JTextArea();
        Font resultFont = new Font("Courier", Font.PLAIN, 12);
        textArea.setFont(resultFont);
        button = new JButton("Generate Report");
        
        // Add the text area in the centre of the window.
        add(textArea, BorderLayout.CENTER);
        
        // Add the button to the top of the window (north)
        add(button, BorderLayout.NORTH);
        
        // Add a listener to the button.
        button.addActionListener(this);
            
        // Make the app quit when we close the window.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        // Set the window to 800 pixels wide and 600 high
        setSize(800, 600);
        
        // Make the window visible.
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	List<EmployeeReport> listEmployeeReport;
    	
    	payrollCalculationService = new PayrollCalculationService();
    	listEmployeeReport = payrollCalculationService.getPayroll();
    	
    	this.textArea.setText("");
    	
    	String string_format ="%-14s%-21s%-12s%-13s%-13s%-13s\n";
    	String text_aux = "Result of Payroll Calculation:\n\n";
    	
    	this.textArea.append(text_aux);
    	
	    text_aux = String.format(string_format,"Employee Name","Contract Type","SSN","Gross","Tax","Net");
	    this.textArea.append(text_aux);
	    
	    text_aux = String.format(string_format,"-------------","--------------------","-----------","------------","------------","------------");
	    this.textArea.append(text_aux);
	    
        for ( EmployeeReport currentEmployeeReport : listEmployeeReport ) {
        	
        	text_aux = String.format( string_format, 
        			   				  currentEmployeeReport.getCompleteName(),
        			    			  currentEmployeeReport.getContractType(),
        			    			  currentEmployeeReport.getSsn(),
        			    			  currentEmployeeReport.getGrossPay(), //gross
        			                  0, //tax
        			                  0  //net
        			                ); 
        	
        	this.textArea.append(text_aux);
         
        } // end for
    	
    }
    
    public void setText(String text) {
    	this.textArea.setText("");
    	this.textArea.append(text);
    }
    
    public static void main (String args[]){
    	
    	@SuppressWarnings("unused")
		MainApp mainApp = new MainApp();
    	
    }
}