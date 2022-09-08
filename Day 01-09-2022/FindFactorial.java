import java.util.Scanner;
class FindFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number for find factorial: ");
	int num = sc.nextInt();
	factorial(num);
    }

    static void factorial(int num) {
	int i, f = 1;
	for (i = 1; i <= num; i++) {
	    f = f * i;
	}
	System.out.print("The factorial of " + num + " is " + f);
    }

}