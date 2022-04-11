package sampletests;

public class LambdaTest implements Runnable{
	
	
	public void rectangle() {
		new Thread(() -> { 
			   int length = 10; 
			   int width = 12;
			   double area = length*width;
			   System.out.println("Area of Rectangle is:"+area);
	      }).start();
	}
	
	public void squre() {
		new Thread(() -> { 
			int length = 10; 
			   double area = length*length;
			   System.out.println("Area of squre is:"+area);
	      }).start();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		LambdaTest it = new LambdaTest();
		
		it.rectangle();
		it.squre();
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
		
}
