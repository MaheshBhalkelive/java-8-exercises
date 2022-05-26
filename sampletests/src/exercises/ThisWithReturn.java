package exercises;

class Test_this
{
	int val_a;
	int val_b;

	//Default constructor
	Test_this()
	{
		val_a = 10;
		val_b = 20;
	}

	Test_this get()
	{
		return this;
	}

	void display()
	{
		System.out.println("val_a = " + val_a + "  val_b = " + val_b);
	}
}

public class ThisWithReturn {

	public static void main(String[] args) {

		Test_this object = new Test_this();
		object.get().display();

	}

}
