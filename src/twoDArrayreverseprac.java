import java.util.*;
public class twoDArrayreverseprac {
    public static void main(String[] args) {
int image [][]={{1,0,0},{0,1,0},{1,1,1}};
for (int i = 0; i < image.length; i++) {
    for (int j = image[i].length - 1; j >= 0; j--) {    
        
image[i][j]^=1;
    System.out.print(image[i][j] + " ");   
}
System.out.println();
}
}
}