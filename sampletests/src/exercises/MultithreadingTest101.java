package exercises;

class Precoss1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i<=20 ; i++) {
			if(i % 2 == 0) {
				System.out.println("even : " + i);
			}
		}
	}
}
class Process2 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i<=20 ; i++) {
			if(i % 2 != 0) {
				System.out.println("odd : " + i);
			}
		}
	}
	
}

public class MultithreadingTest101 {

	public static void main(String[] args) throws InterruptedException{
		
		Precoss1 p1 = new Precoss1();
		Process2 p2 = new Process2();
		
		p1.start();		
		p2.start();	

	}

}
