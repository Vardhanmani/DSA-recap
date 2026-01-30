import java .util.*;
public class whileloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int number = 1;
        int sum = 0;

        while (number<=range) {
           // sum = sum+number;
           sum += number;
           number++;
        }
         System.out.print(sum);
    }
}
