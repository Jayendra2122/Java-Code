public class Recursion3 {

    public static boolean sortArray(int[] arr ,int idx ){
      
          if(idx==arr.length-1){
            return true ;
           
          }
         
        if(arr[idx]<=arr[idx+1]){
            idx=idx+1;
            
           return sortArray(arr, idx);
        }
        
        else{
           return false;
        }

}
   
public static void Movex(String str,int idx, int count,String newString ) {
    

     if(idx==str.length()) {
       
        for(int i=0;i<count;i++){
            newString+='x';
        }
        System.out.print(newString);
        return;
     }
    

    char currchar=str.charAt(idx);
    if(currchar=='x'){ 
    count++;
    Movex(str, idx+1,count, newString);
    }else{
    newString=newString+currchar;
    
    Movex(str, idx+1,count,newString);
    }
   
  
}

    public static void main(String[] args) {
         int[] arr={1,2,3,4};
         System.out.println(sortArray(arr, 0));
         //for move all x at the end of the string
         String str="xbbbxcgvx";
         
         Movex(str, 0,0," ");
       
    }
    
}
