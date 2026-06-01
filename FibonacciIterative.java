public class FibonacciIterative {
    public static void main(String[] args) {
        int n=10;
        for (int i=0;i<n;i++){
            System.out.print(fibonacci(i)+ " ");
        }
    }
    public static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        int a=0;
        int b=1;
        
        for (int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}