public class bubble_Sort {
public static void printarr (int[] arr) {
    for ( int i = 0 ; i<arr.length; i++){
        System.out.println();

    }
}
    public static void main(String[] args) {
    

    int arr [] = {7,8,1,5,2};
for ( int i = 0 ; i<arr.length-1 ; i++){
    for (int j =0; j<arr.length-i-1;j++ ){
        if (arr[j] >arr[j+1] ) {
            //swap
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }

    }
}


}
}