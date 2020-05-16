//Q.46
package GenericsQuestions;
import java.util.*;
public class GenericsArrayList
{
	public static void main(String[] args) 
	{
		System.out.println("Simple use of Generics with ArrayList");
		List <String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		for (String str : list) {
			System.out.println(str);
		}
	}
}