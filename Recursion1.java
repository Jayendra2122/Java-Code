

public class Recursion1 {
  public static void PrintNum(int i, int sum, int n) {
    if (i == n) {
      // sum+=i;
      // sum*=i;
      System.out.println(sum);
      return;
    }
    sum += i;
    // sum*=i;
    PrintNum(i - 1, sum, n);

  }


  //Function for Fibbonaci series
  public static void Fibbonaci(int a, int b, int m) {
    if (m - 1 == 0) {
      return;
    }

    int c = a + b;
    System.out.println(c);
    Fibbonaci(b, c, m - 1);

  }


//function for calculate the power
  public static int calcPower(int x, int p) {
    if (x == 0) {
      return 0;
    }
    if (p == 0) {
      return 1;
    }
    int xpownm1 = calcPower(x, p - 1);
    int xpown = x * xpownm1;
    return xpown;
  }

  public static void main(String[] args) {

    PrintNum(5, 1, 1);
    // for Fibbonaci series
    int a = 0;
    int b = 1;
    System.out.println(a);
    System.out.println(b);
    int m = 7;
    Fibbonaci(a, b, m - 2);
    //for claculate the value of x to the pow p
    int x=5;
    int p=2;
    int xpown=calcPower(x, p);
    System.out.println(xpown);

  }
}
