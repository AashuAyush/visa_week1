package threads;

public class Chars implements Runnable{
	
	public void run() {
		for (int i = 'A'; i<= 'Z'; i++) {
			System.out.println(Thread.currentThread() + " : " + (char) i);
		}
	}
}
