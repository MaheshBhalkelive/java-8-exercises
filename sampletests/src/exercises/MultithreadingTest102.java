package exercises;

public class MultithreadingTest102 implements Runnable {

	public static void main(String[] args) {
		
		Thread guruThread1 = new Thread("Mahi");
		Thread guruThread2 = new Thread("Mahesh");
		
		guruThread1.start();
		guruThread2.start();
		
		System.out.println("Thread names are following:");
		
		System.out.println(guruThread1.getName());
		
		System.out.println(guruThread2.getName());
	}
	
	public void run() {
	}

}
