package sampletests;

class Even extends Thread{
	public void run() {
		for (int i = 0; i < 20; i++) {
			if(i%2 == 0) {
				System.out.println("Even : "+i);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class Odd extends Thread{
	public void run() {
		for (int i = 0; i < 20; i++) {
			if(i%2 != 0) {
				System.out.println("Odd : "+i);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

public class ThreadTest{

	public static void main(String[] args) throws InterruptedException {
		Even e = new Even();
		Odd o = new Odd();
		
		e.start();
		o.start();
	}

}
