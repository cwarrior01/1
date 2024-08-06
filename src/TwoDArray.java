import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("enter rows");
int rows = sc.nextInt ();

System.out.println("enter cols ");

int cols = sc.nextInt();
int [][] matrix = new int [rows] [cols] ;

for ( int i = 0 ; i < rows ;i++){
    for (int j= 0; j< cols ;j++){
System.out.println("enter  matrix ");
        matrix[i][j] = sc.nextInt();
    }
}
for ( int i = 0 ; i < rows ;i++){
    for (int j= 0; j< cols ;j++){
System.out.print(matrix[i][j] + " ");
    }

}
System.out.println();   
}
}
// import java.util.*;

// public class TwoDArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of rows:");
//         int rows = sc.nextInt();

//         System.out.println("Enter number of columns:");
//         int cols = sc.nextInt();
//         int[][] matrix = new int[rows][cols];

//         // Input matrix elements
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print("Enter element at position (" + i + ", " + j + "): ");
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Print the matrix
//         System.out.println("The matrix is:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(matrix[i][j] + "\t");
//             }
//             System.out.println(); // Move to the next line after each row
//         }

//         sc.close(); // Close the scanner
//     }
// }
                           