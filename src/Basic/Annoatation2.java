package Basic;

public class Annoatation2 extends Annotation1 {
	@Override
	public void m1() {
		System.out.println("hi iam from child");
	}
	public static void main(String[] args) {
		Annotation1 a=new Annoatation2();
		
	}
}
