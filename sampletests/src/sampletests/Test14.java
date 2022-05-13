package sampletests;

class Test14 {
	Test14(String s, int i){
		++pid;
		name=s;
		age = i;
	}
	static int pid;
	int age;
	String name;
	
}

public class Testt{
	public static void main(String[] args) {
		Test14 t1 = new Test14("John", 22);
		Testt t2 = new Testt();
		
		Test14 t3 = t2.change(t1);
		System.out.println(t3.pid + " " +t3.name + " " + t3.age);
		System.out.println(t1.pid + " " +t1.name + " " + t1.age);
		
	}
	private Test14 change(Object o) {
		Test14 t3 = (Test14)o;
		t3.age = 25;
		
		return t3;
	}
	
}


