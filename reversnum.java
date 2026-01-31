import java.util.*;
public class reversnum {
    public static void main(String[] args) {
        int number=103484;
        while (number > 0) {
            int lastnum = number%10;
            System.out.print(lastnum);
            number=number/10;
        }
    }
}        