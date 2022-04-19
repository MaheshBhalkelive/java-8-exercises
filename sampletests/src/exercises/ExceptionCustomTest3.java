package exercises;

public class ExceptionCustomTest3 extends Exception {
 
	/*The serialization at runtime associates with each serializable class 
	a version number called a serialVersionUID, which is used during deserialization 
	to verify that the sender and receiver of a serialized object 
	have loaded classes for that object that are compatible with respect to 
	serialization.*/
		private static final long serialVersionUID = 1L;

		ExceptionCustomTest3(String message){
			super(message);
		}

}
