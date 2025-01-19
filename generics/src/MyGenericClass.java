/* 
	Class using generic bounded type. A bounded type means the data must be of a specific
   	derived type.
*/

public class MyGenericClass <T extends Number> {

	T x;
	
	MyGenericClass(T x) {
		this.x = x;
	}
	
	public T getValue() {
		return x;
	}
}
