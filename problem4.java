public class problem4 {
    public static int fib(int n) {
            if (n == 0) {
                return 0; 
            } else if (n == 1) {
                return 1; 
            }
            int prev1 = 0; 
            int prev2 = 1; 
            int current = 0; 
            
            for (int i = 2; i <= n; i++) {
                current = prev1 + prev2; 
                prev1 = prev2; 
                prev2 = current;
            }
            
            return current;
        }
    
        public static void main(String[] args) {
            int n = 10;
            System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
    
}
