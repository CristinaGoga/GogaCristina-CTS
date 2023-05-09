package Seminar11.state.program;

import Seminar11.state.clase.Masa;

public class Main {
	public static void main(String[] args) {
		Masa masa = new Masa(6);
		
		masa.elibereazaMasa();
		
		masa.ocupaMasa();
		
		masa.rezervaMasa();
		
		masa.ridicaRezerervare();
		
		masa.ocupaMasa();
		
		masa.elibereazaMasa();
		
		masa.rezervaMasa();
	}

}
