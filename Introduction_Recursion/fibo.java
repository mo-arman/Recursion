public class fibo {
    public static void main(String[] args) {
        int ans = fibonacchi(4);
        System.out.println(ans);
    }
    static int fibonacchi(int n){
        // base condition 
        if(n<2){
            return n;
        }
        return fibonacchi(n-1) + fibonacchi(n-2);
    }
}
