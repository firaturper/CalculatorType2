package homework_1;

import java.text.*;
import java.util.*;

public class TurkishStyleCalculator implements MuhendislikHesapMakine{

	@Override
	public void displayResult(double result) {
		
		NumberFormat tr = NumberFormat.getInstance(Locale.ITALY);
		
		System.out.println("Türkiye Formatý: "+ tr.format(result));
		
	}

	@Override
	public double usalma(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double karekokalma(double a) {
		// TODO Auto-generated method stub
		return 0;
	}
	


		
	}
