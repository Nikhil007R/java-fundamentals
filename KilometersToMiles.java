import java.util.*;

class KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	System.out.println("Enter distance in kilometer: ");
        double Kilometer = sc.nextDouble();
	double miles = Kilometer * 0.621371;

	System.out.println("Miles are: " + miles);
        
    }
}
