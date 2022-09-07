import java.util.Scanner;

class Factorial {

	static void cal(int num) {
		int fact=1; 
  		for(int i=1; i<=num; i++){    
      			fact=fact*i;    
  		}    
  		System.out.println("Factorial of "+ num +" is: "+fact);    
 		}  
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = scan.nextInt();

		cal(num);
	}

	

}