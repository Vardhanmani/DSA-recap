import java.util.*;
public class saverevers {
    public static void main(String[] args) {
        int n=1889078;
        int rev=0;
        while (n>0) {
            int lastnum=n%10;
            rev=(rev*10)+lastnum;
            n=n/10;
        }
        System.out.print(rev);
    }
}
