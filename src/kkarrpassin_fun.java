import java.util.Arrays;

public class kkarrpassin_fun {
public static void main(String[] args) {
    int [] ar= {10,25,15,12,54,2};

    System.out.println(Arrays.toString(ar));

change(ar);
System.out.println(Arrays.toString(ar));
}

static void change (int [] arr){
    arr[0]= 99;
}
}
