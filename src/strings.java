public class strings {
    public static void main(String[] args) {
        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println(number);                      
   
        StringBuilder hn =  new StringBuilder("Tony");
        System.out.println(hn);
   System.out.println(hn.charAt(1));
hn.setCharAt(0,'s');
System.out.println(hn);    
hn.insert(0, 'b');
System.out.println(hn);
hn.delete(1,2);
System.out.println(hn);
hn.delete(0,1);
hn.insert(0,'t');
hn.delete(2,3);
System.out.println(hn);

}
    
}
