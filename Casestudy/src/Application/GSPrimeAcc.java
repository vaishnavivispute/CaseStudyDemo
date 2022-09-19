package Application;

import FrameWork.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc 
{

	private static final float charges=5000; 
	
	
	public float getCharges() {
		return charges;
	}
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}

	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear Prime User, Your Product Charges are: "+charges);
	}

	
	
	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}

	@Override
	public void items(float f) {
		// TODO Auto-generated method stub
		
	}
	

}