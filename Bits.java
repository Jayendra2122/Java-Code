
public class Bits {

    public static void main(String[] args) {
        int n=5;//0101
        int pos=0;
        int bitMask=1<<pos;
        // if((bitMask & n)==0){
        //     System.out.println("Bit was zero");
        // }else{
        //     System.out.println("Bit was one");
        // }
        //code for set the bit
        
        //code for clear bit
        int notBitMask=~(bitMask);
        int newNumber=notBitMask & n;
        System.out.println(newNumber);
        

    }
}