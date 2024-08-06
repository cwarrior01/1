import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
int [] nums = { 1,23,3,12,25,54};
      int target  =23;
      boolean ans = linearSearch1(nums,target);

    System.out.println(ans);
    
int an = linearSearch(nums,target);
    System.out.println(an);
}
static int linearSearch(int []arr, int tar ){
    if (arr.length==0){
        return -1;
    }
for (int i = 0; i< arr.length;i++){
    // int element = arr[i];
    if(arr[i] ==tar){
        return i;
    }

}
return -1;
}
static boolean linearSearch1(int []arr, int tar ){
    if (arr.length==0){
        return false;
    }
for (int i = 0; i< arr.length;i++){
    // int element = arr[i];
    if(arr[i] ==tar){
        return true;
    }


}

return false;
}

}