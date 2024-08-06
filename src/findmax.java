public class findmax {
public static void main (String []args){
    int [] arr = {18,-1,3,4,5,75,4,5,4};
    System.out.println(max(arr));

    int [] ar= {18,-1,3,4,5,75,4,5,4};
    System.out.println(max1(ar));
}
// form minimum no 
static int max(int [] arr ){
    int ans = arr[0];
    for (int i= 0 ; i<arr.length; i++){
        if ( ans >arr[i]){
            ans = arr[i];

        }
    }
return ans ;
}
// for maximun mo
static int max1(int [] arr ){
    int ans = arr[0];
    for (int i= 0 ; i<arr.length; i++){
        if ( ans <arr[i]){
            ans = arr[i];

        }
    }
return ans ;
}
}
