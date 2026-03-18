package lambdaexpressiondemo;

//demo for with parameter
@FunctionalInterface
interface Cube{
	int calculate(int a);
}

public class Withparameter {
public static void main(String[] args) {
	Cube c=(a)->{return(a*a*a);};
	System.out.println("cube of a number "+c.calculate(7));

}
}
