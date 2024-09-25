

public class sum {
    public static void main(String[] args) {
        int ans = sum(1324);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return (n%10) + sum(n/10);
    }
}
