package lambdaexpressiondemo;

//demo for with lambda expression
@FunctionalInterface
interface Drawabl{
	public void draw();
}

public class Withlambda {
	public static void main(String[] args) {
		int width=10;
		Drawabl d2=()->{System.out.println("drwaing "+width);	};
	d2.draw();

}
}