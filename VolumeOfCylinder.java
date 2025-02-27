import java.util.*;

class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	System.out.println("Enter radius: ");
        int radius = sc.nextInt();
	System.out.println("Enter height: ");
	int height = sc.nextInt();
	
	double  vol = Math.PI * radius * radius * height;

        System.out.format("Volume of cylinder is %.2f", vol);
    }
}
