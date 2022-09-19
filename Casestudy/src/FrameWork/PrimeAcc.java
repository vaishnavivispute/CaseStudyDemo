package FrameWork;

public class PrimeAcc extends ShopAcc
{

	
	public static boolean isPrime;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}
	public void bookProduct(float charges)
	{
		System.out.println("Charges are: "+charges);
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime() + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		PrimeAcc.isPrime = isPrime;
	}
	@Override
	public void items(float f) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
