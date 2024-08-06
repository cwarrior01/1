import java.util.*;
public class hash {
    public static void main(String[] args) {
        HashSet<Integer> value = new HashSet<>();
        value.add(12);
        value.add(17);
        value.add(15);
        value.add(13);
        value.add(19);
        System.out.println(value);
if (value.contains(20))
System.out.println("present");

else{
    System.out.println("not present ");
}

value.remove(12);    
System.out.println(value);
}

}
