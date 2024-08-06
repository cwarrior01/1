public class searachinrange {
    public static void main(String[] args) {
int []arr ={18,12,3,4,6,7,8,91};
int target = 3;
int start = 2;
int end = 7;
int ans = linearSearch(arr, target, start, end);
System.out.println(ans);
       
     } static int linearSearch(int []arr, int tar ,int start,int end ){
    if (arr.length==0){
        return -1;
    }
for (int i = start; i<=end;i++){
    // int element = arr[i];
    if(arr[i] ==tar){
        return i;
    }

}
return -1;
}
    }


