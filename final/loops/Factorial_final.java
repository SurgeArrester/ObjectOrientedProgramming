import java.util.Scanner;

public class Factorial_final {
    public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    int n = myScanner.nextInt();
    int factorial = 1;

    for(int i = 1; i <= n ; i++) {
         factorial = factorial * i;
    }

    System.out.println(factorial);
    
}}
