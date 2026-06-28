import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("fibonacci of " + n + " is " + fib(n));
    }
    
    public static int fib(int n) {   
        if (n == 0 || n == 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2); 
    }
}
