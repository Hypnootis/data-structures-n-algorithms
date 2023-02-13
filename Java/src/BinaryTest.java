import java.util.Scanner;

public class BinaryTest {
	
	private double radius;
	
	public BinaryTest(double radius) {
		this.radius = radius;
		
	}
	
	public double getArea() {
		return Math.PI * (this.radius * this.radius);
	}
	
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter area: ");
		double area = s.nextDouble();
		BinaryTest test = new BinaryTest(area);
		System.out.println(test.getArea());
	}


	
}