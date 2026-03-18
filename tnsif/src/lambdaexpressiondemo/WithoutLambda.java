package lambdaexpressiondemo;

//demo for without lambda

@FunctionalInterface
interface Drawable{
	public void draw();
	
}
class Test implements Drawable{
int width=10;
	@Override
	public void draw() {
		System.out.println("drawing "+width);
		
	}
	
}
public class WithoutLambda {
public static void main(String[] args) {
	Test t=new Test();
	t.draw();
}
}