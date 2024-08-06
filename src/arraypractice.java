import java.util.Scanner;
public class arraypractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size ");
        int a = sc.nextInt();
        
        int [] arr = new int [a];
       System.out.println("enter array ");
        for (int i = 0; i<arr.length;i++){
        
        arr[i]= sc.nextInt();
       

        }
        for (int i = 0; i<arr.length;i++){
        
            System.out.print(arr[i] +"  ");
           
    
            }
            System.out.println(" ");
    int b = arr[0];
    System.out.println(b);
    }

}
