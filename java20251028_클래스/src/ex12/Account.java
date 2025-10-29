package ex12;

public class Account {

	
 private int balance;


 
 
 
	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE=1000000;
	
	
	
    public int getBalance() {
		return balance;}
	public int getDeposit() {
			return balance;}
	public int getWithdraw() {
			return balance;}
		
    
    public void setBalance(int balance) {
	    if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
	    	this.balance = balance;
	    }
	} 
    
 // ⭐ [새로운 기능] 돈을 입금하는 기능! ⭐
    public void setdeposit(int amount) {
        // 새로 들어온 돈(amount)을 더했을 때,
        // 저금통 규칙(100만원)을 넘지 않는지 문지기가 확인해요.
        if (balance + amount <= MAX_BALANCE) {
            balance = balance + amount; // 규칙에 맞으면 돈을 더해줘요!
            System.out.println(amount + "원이 입금되었습니다. 현재 잔고: " + balance + "원");
        } else {
            // 규칙에 어긋나면 입금할 수 없다고 알려줘요.
            System.out.println("저금통이 가득 차서 더 이상 입금할 수 없어요!");
        }
    }

    // ⭐ [새로운 기능] 돈을 출금하는 기능! ⭐
    public void setwithdraw(int amount) {
        // 빼려는 돈(amount)을 뺐을 때,
        // 저금통 규칙(0원)보다 적어지지 않는지 문지기가 확인해요.
    	        if (balance - amount >= MIN_BALANCE) {
            balance = balance - amount; // 규칙에 맞으면 돈을 빼줘요!
            System.out.println(amount + "원이 출금되었습니다. 현재 잔고: " + balance + "원");
        } else {
            // 규칙에 어긋나면 돈이 부족하다고 알려줘요.
            System.out.println("잔액이 부족해서 출금할 수 없어요!");
        }
   
}}