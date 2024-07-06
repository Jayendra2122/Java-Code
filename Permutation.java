public class Permutation {   

 public static void printAllpermutations (String str ,String Permutation) {
      
if(str.length()==0){
    System.out.println(Permutation);
}
for(int i=0;i<str.length();i++){
    char currChar=str.charAt(i);
    String newstr=str.substring(0, i)+str.substring(i+1);
    printAllpermutations(newstr, Permutation+currChar);


}
}

     public static void main(String[] args) {
     String str="abc";
     printAllpermutations(str, "");
        
    }
}
