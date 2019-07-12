package threads;

public class NAccountClient {

	public static void main(String[] args) {
		NAccount account = new NAccount(5000);
		NTransactionThread t1 = new NTransactionThread(account, TransactionType.CREDIT, "Roger", 2000);
		NTransactionThread t2 = new NTransactionThread(account, TransactionType.CREDIT, "\tAmy", 3500);
		NTransactionThread t3 = new NTransactionThread(account, TransactionType.DEBIT, "\t\tCalvin", 6000);
		
		t3.start(); //not sure it will start first
		t1.start();
		t2.start();
		
		try {
			t1.join(); t2.join(); t3.join(); // caller (main thread) waits for other thread to complete their run
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance : " + account.getBalance());
	}

}
