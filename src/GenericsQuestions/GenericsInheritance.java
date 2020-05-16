//Q.53
package GenericsQuestions;
public class GenericsInheritance {
	public static void main(String[] args) {
		String str = "abc";
		Object obj = new Object();
		obj=str;
		MyClass<String> myClass1 = new MyClass<String>();
		MyClass<Object> myClass2 = new MyClass<Object>();
		obj = myClass1;
	}
	public static class MyClass<T>{}
}