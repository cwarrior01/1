import java.util.*;

public class stringggkk {
    public static void main(String[] args) {
        String msg = greet ();
System.out.println(msg);

Scanner sc = new Scanner (System.in);
String v1 = sc.next();

String robin = myGreet(v1);
System.out.println(robin);    
}


    static String myGreet(String value){
String messs= "hello" + "  "+ value;
return messs;

    }
static String greet(){
    String greeting = " how are you ";
    return greeting ;

}
}
