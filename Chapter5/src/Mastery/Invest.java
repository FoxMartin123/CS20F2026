package Mastery;

public class Invest {
	
	    public static void main(String[] args) {
	        double base = 2500.0;
	        double end = 5000.0;
	        double rate = 0.075;

	   
	        double years = Math.log(end / base ) / Math.log(1 + rate);

	        System.out.printf(" time required: %.2f years%n", years);
	    }
	}

