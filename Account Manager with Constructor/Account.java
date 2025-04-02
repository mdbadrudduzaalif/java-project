import java.lang.*;
class Account {
    private int accountNo;
    private double balance;
    public static double perDayTransactionLimit = 500;
	static double rate=5;
    static{
    System.out.println("this is static block.");		
	
	}
    public Account(int an, double b) {
        accountNo = an;
        balance = b;
    }

    public void addInterest() {
        balance = balance + (balance * rate / 100);
    }

    public void show() {
        System.out.println("Accountno: " + accountNo);
        System.out.println("Balance: " + balance);
    }

public static void main(String[] args) {
Account acc1 = new Account(101, 1500);
Account acc2 = new Account(102, 2500);
Account acc3 = new Account(103, 3500);

System.out.println("Account details:");
acc1.show();
acc2.show();
acc3.show();
	
acc1.addInterest();
acc2.addInterest();
acc3.addInterest();
		  
acc1.show();
acc2.show();
acc3.show();			
		 
System.out.println("rate(static variable) :"+rate);
System.out.println("Per day transaction limit: (static variable)" + Account.perDayTransactionLimit);
}
}
