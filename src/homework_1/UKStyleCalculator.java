package homework_1;

import java.text.*;
import java.util.*;

public class UKStyleCalculator implements MuhendislikHesapMakine{

	@Override
	public void displayResult(double result) {
	
		NumberFormat uk = NumberFormat.getInstance(Locale.US);
		
		System.out.println("English style: "+ uk.format(result));
		
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

