package com.catolica;

public class TestaFatura {
	
	public static void main(String[]rgs) {
		Fatura f = new Fatura("456", "NET", 5, 4.5);
		
		
		
		double exibe = f.totalFaturado();
		
		System.out.println("Total "+exibe);
	}
	

}
