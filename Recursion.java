public class Recursion {
//code for sum of n numbers
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i + 1, n, sum);
    }
//code for factorial of n
public static int calcFact(int n) {
    if(n==1 || n==0){
        return 1;
    }
    int fact_nm1= calcFact(n-1);
    int fact_n=n*fact_nm1;
    return fact_n;
}
//Code For fibbonaci series
public static void fibbonaci(int a,int b,int n) {
if(n==0){
return ;
}
    int c=a+b;
    System.out.println(c);
    fibbonaci(b, c, n-1);
}
    public static void main(String[] args) {
        printSum(1, 10, 0);
        
        System.out.println(calcFact(5));
  int a=0,b=1;
  System.out.println(a);
  System.out.println(b);
  fibbonaci(a, b, 7);
    }
}