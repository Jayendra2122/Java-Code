public class Subsequences {

    public static void Subsequence(String str,int idx,String newString) {
        
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        //for to be
        Subsequence(str, idx+1, newString+currChar);
        //for not to be
        Subsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        Subsequence(str,0," ");
        
    }
}
