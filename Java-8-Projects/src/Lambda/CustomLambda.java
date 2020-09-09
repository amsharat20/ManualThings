
package Lambda;

public class CustomLambda {
	public static void main(String[] args) {
		MyLambda LambdaFunction = () -> System.out.println("Helo World");
		AddLambda  AddFunction = (int a , int b) -> a+b;
	}
}

interface MyLambda {
	void foo();
}

interface AddLambda {
	int foo(int a , int b);
}