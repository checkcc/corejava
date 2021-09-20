package com.generics;
// We use < > to specify Parameter type
class Test<T> {
	// An object of type T is declared
	T obj;//stgring.int ,float,byte

	Test(T obj) {
		this.obj = obj;
	} // constructor

	public T getObject() {
		return this.obj;
	}
}

// Driver class to test above
class Demo {
	public static void main(String[] args) {
		// instance of Integer type
		Test<Integer> iObj = new Test<Integer>(15);// this int is yours
		System.out.println(iObj.getObject());

		// instance of String type
		Test<String> sObj = new Test<String>("GeeksForGeeks"); //string
		System.out.println(sObj.getObject());
		
		
		// instance of Integer type
		Test<Float> iObj22 = new Test<Float>(15.85f);// this int is yours
		System.out.println(iObj22.getObject());
	}
}
