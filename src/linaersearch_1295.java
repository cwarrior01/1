public class linaersearch_1295 {
public static void main(String[] args) {
    int [] nums = {12,6,22,2464,215,1,42, };
    System.out.println(findNumbers(nums));
System.out.println(counting(0));
} 
static int findNumbers(int[] nums) {
   int count =0;
   for ( int i = 0 ; i<nums.length;i++){
    if (even(nums[i])){
        count++;
    }
   } 
  return count ;      
}
static boolean even (int num){
    int noOfdigits = counting(num);
if (noOfdigits % 2 ==0){
   return true;
}
return false;
}
static int counting(int num){
   int count =0;
    while(num>0) {

num = num/10;
count ++;   
}
return count;
}
}
