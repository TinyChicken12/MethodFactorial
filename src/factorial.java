import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:");
        int N = scanner.nextInt();

        long fact = factorial(N);

        System.out.println("The factorial of N is: "+ fact);
    }

    public static long factorial(int N){
        if(N == 0)
        {
            return 1;
        }
        return N*factorial(N-1);
    }
}