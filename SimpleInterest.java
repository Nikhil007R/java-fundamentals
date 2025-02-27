import java.util.*;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	System.out.println("Enter principal: ");
	int principal = sc.nextInt();
	
	System.out.println("Enter rate: ");
	int rate = sc.nextInt();
	
	System.out.println("Enter time: ");
	int time = sc.nextInt();

	float si = (principal * rate * time) / 100;
	System.out.println("Simple Interest is: "+ si);

 	
        
    }
}
