package exercises;

public class MultithreadingTest103 implements Runnable{

	@Override
	public void run() {
	}
	
	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t.setPriority(1);
		int gurupriority = t.getPriority();
		System.out.println(gurupriority);
		System.out.println("Thread Running");
	}

}
