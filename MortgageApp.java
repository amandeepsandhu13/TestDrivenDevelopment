import static org.junit.Assert.assertTrue;

/*
Program Name: MortgageApp.java
	  Author: Aman Sandhu
        Date: Apr 4, 20188:23:17 AM
 Description:
 */
public class MortgageApp
{
	
	private double mortPayementPerMon = 0.0;
	private int credit;
	
	MortgageApp(){
		
	}
	
public void setCreditVal(int c) {
		
		this.credit =c;
		
	}
	
	public int getCreditVal() {
				
		return this.credit;
		
	}
	 
public void set(String variable, double value) {									
	
}
	
/* mortgage approved or not */
public boolean evaluateMortgage(double salary, double payment) {
	 
	 this.mortPayementPerMon = payment;
	 double salPercent = salary * 0.6;
		
		if(mortPayementPerMon < salPercent && validateCredit() == true) {
				return true;
		}else {
				return false;
		}
			 	
	}
	
public boolean validateCredit() {
	
	if(credit < 3) {
		return true;
	}else {
		return false;

	}
	
}



}
