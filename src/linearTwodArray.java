import java.util.*;
public class linearTwodArray {
public static void main(String[] args) {
    int [] [] arr = {{15,25,147},
                    {45,997,644,877},
                    { 10,23,554,4,1,12}};

                  // for maximun  
                    int  ans1 = max(arr);
                    System.out.println(ans1);

                    // another way of printing fuction vlaue 
                    


                    System.out.println(max(arr));


                    // For finding 

                   int target = 12;
                   int [] ans = twods(arr, target);
                   System.out.println(Arrays.toString(ans));
}
// this is for finding a a element in the array 
                   static int [] twods (int [][]ar, int target){
                for (int i = 0 ; i<ar.length;i++){
                   
                    for (int j= 0 ; j<ar[i].length;j++){
                        if (ar[i][j] == target ){
                            return new int []{i,j};

                        }
                   

                    }
                }
           
        
            return new int [] {-1,-1}; 
        }
        // this is for max finding max value in the array 
        static int max (int [][]ar){
            int max = Integer.MIN_VALUE;
            for (int i = 0 ; i<ar.length;i++){
               
                for (int j= 0 ; j<ar[i].length;j++){
                    if (ar[i][j]> max){
                        max = ar[i][j];

                    }
               

                }
            }
       
    return max;
         
    }   
    }