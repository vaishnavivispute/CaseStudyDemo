package Application;


public class User
{
	public static void main(String[] args) 
	{
		// Step 1 - Step a
		GSShopFactory gssfactory = new GSShopFactory();
		// Step 2
		
		GSPrimeAcc gsprime = gssfactory.getNewPrimeAccount(123, "Vaishnavi", 5000, true);
		//GSPrimeAcc gsprime = new GSPrimeAcc();
	
		System.out.println(gsprime.getAccNm());
		
		System.out.println(gsprime.getAccNo());
		
		System.out.println(gsprime.getCharges());
		// Step 4 / Step d.
		gsprime.bookProduct(1000);
		
		// Step 5 / Step e.
		gsprime.toString();
		
		// Step 3
		gssfactory.getNewNormalAccount(456, "Vishkha", 4000, 100);
		GSNormalAcc gsnormal = new GSNormalAcc(); 
		
		System.out.println(gsnormal.getAccNm());
		System.out.println(gsnormal.getAccNo());
		System.out.println(gsnormal.getCharges());
		gsnormal.getDeliveryCharge();
		
		// Step 4 / Step d.
		gsnormal.bookProduct(1000);
		// Step 5 / Step e.
		gsnormal.toString();
	
		

	}

}

