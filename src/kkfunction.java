import java.util.*;


public class kkfunction {
    public static void main(String[] args) {
        sum ();
        int ans = sum1 ();
        System.out.println(ans);

int addd = sum2(20 , 40);
System.out.println(addd);
    }

static int sum2(int a , int b ){
    int sum = a+b ;
    return sum ;

}


    static int sum1(){
    Scanner in = new Scanner (System.in);
    System.out.println("enter no 1 ");
    int n1= in.nextInt();
    
    System.out.println("enter no 2");
    int n2= in.nextInt();
    
    int sum = n1 + n2 ;
   return sum;
}

static void sum() {
    Scanner in = new Scanner (System.in);
System.out.println("enter no 1 ");
int n1= in.nextInt();

System.out.println("enter no 2");
int n2= in.nextInt();

int sum = n1 + n2 ;
System.out.println(sum);

}


}
