import java.util.*;

class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	System.out.println("Enter base: ");
        double base = sc.nextInt();
	
        System.out.println("Enter exponent: ");
	double exp = sc.nextInt();

	double power = Math.pow(base, exp);
	System.out.println(power);
    }
}
