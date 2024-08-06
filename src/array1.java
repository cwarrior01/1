import java.util.Scanner;
public class array1 {
    // Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int s = sc.nextInt();
//     // int[] arr = new int[4];
//     int marks [] = new int [s];
  
   
//     for ( int i = 0 ; i < s ; i++){
//        marks [i] =sc.nextInt(); 

// }
// System.out.println("enter the finding value");
// int x =sc.nextInt();

// for (int i= 0 ; i < marks.length ;i++){
//     if (marks[i]==x){
//     System.out.println("x found at index " + " "+ i);
//     }
// }
//  Scanner sc = new Scanner (System.in);
// System.out.println("enter no  of  names");
// int g = sc.nextInt();
//  String name []= new String[g];
// System.out.println("enter names ");
//  for (int i=0; i <g; i++){
    
//     name[i]=sc.next();

//  }
// for (int i = 0 ; i < g ;i++){
//     System.out.println(name[i]);
// }
// sc.close();
// Scanner sc = new Scanner (System.in );
 
// System.out.println("numbers");

// int  input = sc.nextInt();

// int find [] = new int [input];

// for (int i = 0 ; i<input ; i++){
    
// }
// Scanner sc = new Scanner (System.in);
// int target = sc.nextInt();
// int nums [] = {2,7,11,15};
// for (int i = 0 ; i <nums.length-1;i++){
//     for (int j = i+1 ; j<nums.length ;j++){
//         if (nums[i]+ nums[j] == target){
            
//         }
//     }
// }


Scanner sc = new Scanner(System.in);

System.out.println("enter rows");
int rows = sc.nextInt ();

System.out.println("enter cols ");

int cols = sc.nextInt();
int [][] matrix = new int [rows] [cols] ;


System.out.println("enter matrix elements: ");
for ( int i = 0 ; i < rows ;i++){
    for (int j= 0; j< cols ;j++){
        matrix[i][j] = sc.nextInt();
    }
}


System.out.println("Matrix is: ");

for ( int i = 0 ; i < rows ;i++){
    for (int j= 0; j< cols ;j++){
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();

}

}
}

