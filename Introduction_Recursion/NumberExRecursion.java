public class NumberExRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
      // base Condition
      if(n==5){
        System.out.println(n);
        return;
      }
      System.out.println(n);

      // recursive call
      // if you are calling a function again and again you cn treat it is a seperate call in the stack

      // this is called tail recursion 
      // this is last function call
        print(n+1);
    }
}
