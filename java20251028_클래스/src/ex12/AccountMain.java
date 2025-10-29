package ex12;

public class AccountMain {

	public static void main(String[] args) {

		Account acc = new Account();
	    
		acc.setBalance(8520);
		System.out.println(acc.getBalance());
		//System.out.println(8520); 이렇게 바뀐다.
	
	    acc.setBalance(-200);
	    System.out.println(acc.getBalance());
	    
	    acc.setBalance(2000000);
	    System.out.println(acc.getBalance());
	    
	    acc.setBalance(1000000);
	    System.out.println(acc.getBalance());
	    
	    acc.setBalance(-500);
	    System.out.println(acc.getBalance());
	    
	    acc.setBalance(50000);
	    System.out.println(acc.getBalance());
	    
	    acc.setdeposit(3000);
	    System.out.println(acc.getBalance());

	    acc.setdeposit(7000);
	    System.out.println(acc.getBalance());
	    
	    acc.setwithdraw(50000);
	    System.out.println(acc.getBalance());
	}

}
