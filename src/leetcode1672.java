public class leetcode1672 {
    public static void main(String[] args) {
int [][]acc = {{1,2,3},
            {15,25,14},
                {5,33,17}};
    }
       
      public  int maximumWealth(int[][] acc) { 
            
            int a = Integer.MIN_VALUE;
        for (int i = 0 ; i<acc.length; i++){
            int sum = 0 ;
            for  (int j= 0 ; i<acc[i].length; j++){
                sum += acc[i][j];

            }
        if (sum > a ){
            a = sum ;
        }
        }
    return a ;
    }

}
