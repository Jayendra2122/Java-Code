public class Recursion2 {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("trasfer disk" + n + "from" + src + "to" + helper);
            return;
        }
        towerOfHanoi(n - 1, src, helper, dest);
        System.out.println("trasfer disk" + n + "from" + src + "to" + helper);
        towerOfHanoi(n - 1, helper, src, dest);

    }
//Function for print reverse of a string

    public static void printRev( String str, int idx ) {
         if(idx==0){
            System.out.println(str.charAt(idx));
            return;
         }

        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
        
    }
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(String str , int idx ,char element) {
          if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;

          }
        char currChar=str.charAt(idx);
        if(currChar==element){
          if(first==-1){
            first=idx;
          }else{
            last=idx;
          }  
        }
        findOccurance(str, idx+1, element);
    
    }


    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
        //for print the reverse of a string
       String str="abcd";
       int idx=str.length()-1;
        printRev(str,idx);
        //for find the ocuurance
        String st="bbcddbb";
        findOccurance(st, 0,'b');
    }
}
