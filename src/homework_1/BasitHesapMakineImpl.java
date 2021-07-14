package homework_1;


class BasitHesapMakineImpl implements BasitHesapMakine {
	 
	@Override
    public double toplama(double a,double b) {
 	return a+b;
     }
	@Override
    public double cikarma(double a,double b) {
    return a-b;
     }
	@Override
    public double carpma(double a,double b) {
    return a*b;
     }
	@Override
    public double bolme(double a,double b) {
    return a/b;
     }
    
	@Override
	public void displayResult(double result) {
		// TODO Auto-generated method stub
		
	}

}
