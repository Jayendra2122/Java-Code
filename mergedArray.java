public class mergedArray {


public static void main(String [] args){
int [] nums1={1,2,3,5};
int nums2 []={4,6,7,8,9,10};
int size = nums1.length + nums2.length;
int merged [] =new int [size];

float median;
float mass;
for(int i=0;i<nums1.length;i++){
merged[i]=nums1[i];
}
for(int i=0;i<nums2.length;i++){
merged[nums1.length+i]=nums2[i];
}
for(int i=0;i<merged.length;i++){
for(int j=i+1;j<merged.length;j++){
if(merged[i]>merged[j]){
    int temp;
    temp=merged[i];
    merged[i]=merged[j];
    merged[j]=temp;
}
}

}
if(size%2==0){
median =(merged[size/2]+merged[(size/2)-1]);
mass =median/2;
}else{
median =(merged[(size/2)]);
mass=median;
}
System.out.println(mass);
for(int i=0;i<merged.length;i++){
    System.out.println(merged[i]);

}


}
}
