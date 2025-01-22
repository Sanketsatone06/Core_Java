package Day_12;



   class Credit{
	   int amount = 20000;
    	public void credit(int creditamt) {
    	 amount += creditamt;
        System.out.println("credited amount is : " + creditamt);
        System.out.println(" Amout after credited  is : " + amount);
    }
}

class Debit extends Credit  {
	public void debit(int debitamt) {
		 amount -= debitamt;
		System.out.println("debited amount is : " +  debitamt);
		System.out.println("Amount after debited  is : " +  amount);
	}
}

public class Bank{
	public static void main(String [] args) {
		
		int creditamt = 3000;
		int debitamt = 2546;
		
		Debit amount = new Debit();
		amount.credit(creditamt);
		amount.debit(debitamt);
		
	}
}

