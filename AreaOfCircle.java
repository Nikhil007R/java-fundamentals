import java.util.*;

class AreaOfCircle{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r = sc.nextInt();
		
		double area = Math.PI * r*r;

		// System.out.println("Area of circle is " + area);
		System.out.format("%.2f", area);
	}
}
