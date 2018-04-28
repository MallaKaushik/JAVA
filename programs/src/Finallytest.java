
public class Finallytest {
 public static void main(String [] args)
 {
	 method("5");
	 method("abc");
	 method("0");
 }

public static void method(String value) {
	try {
		int n=Integer.parseInt(value);
		System.out.println(100/n);
	}
	catch(NumberFormatException ex) {
		System.out.println("Invalid number !");
	}
	finally {
		System.out.println("finally block.");
	}
	System.out.println("method completed");

}
}