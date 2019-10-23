package com;

public class Sign {


	String symbol ;
	
	public void switchSign(double randomNumber1, double randomNumber2, double reasult, int sign) {
		switch(sign) {
		case 1:
			symbol = "+";
			break;
		case 2:
			symbol =  "-";
			break;
		case 3:
			symbol =  "*";
			break;
		case 4:
			symbol =  "/";
			break;
		}
		if(randomNumber1 < 0 && randomNumber2 >0) {
			System.out.println("(" + randomNumber1 + ")" + symbol + randomNumber2 + " = " + reasult);
		}else if(randomNumber1 > 0 && randomNumber2 <0) {
			System.out.println( randomNumber1  + symbol + "(" +randomNumber2  + ")" + " = " + reasult);
		}else if(randomNumber1 < 0 && randomNumber2 < 0) {
			System.out.println( "(" + randomNumber1 + ")" + symbol + "(" + randomNumber2  + ")" + " = " + reasult);
		}else {
			System.out.println(  + randomNumber1   + symbol  + randomNumber2   + " = " + reasult);
		}
				
		
	}

	
}
