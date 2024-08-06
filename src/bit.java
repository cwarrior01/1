import java.util.*;
public class bit {
    public static void main(String[] args) {
      Scanner sc = new Scanner ( System.in);
        //  Get bit (it shows the value of the v on positon 3)
        // int v = 5; 
        // int pos = 3;
        // int bitMask = 1<<pos;
        // if ((bitMask & v) == 0 ){
        //     System.out.println("bit was zero");
        // }else {
        //     System.out.println("bit was non zero ");
        // }

    
    // Set bit (you change the bit 0 either 1 int the  4 bits  )
    //     int n = 5 ;
    //     int v = 1;
    //     int bitmask = 1<<v;
    //    int new_or = bitmask| n;
    //    System.out.println(new_or); 

    // clear  bit ( its clear all the bits of the v variable by logic)
    // int n = 5 ;
    //     int v = 1;
    //     int bitmask = 1<<v;
    //    int new_neg = ~(bitmask);
    //    int and_op = new_neg & v;
    //    System.out.println(and_op); 

    // update bit ()
    int n = 5 ;
    int pos = 1 ; 
    int g = sc.nextInt();
    int bitmask = 1<<pos;
    if (g == 1 ){
        int newno = bitmask | n;
        System.out.println(newno);

    } else if (g ==0 ) {
        int newbit = ~(bitmask);
        int and = newbit & n ;
        System.out.println(and);
    }
  

    
    }

}
