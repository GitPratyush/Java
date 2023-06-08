//Finding largest among 3 numbers
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int a= in.nextInt();
         int b= in.nextInt();
         int c= in.nextInt();
         int max=a;
         if (b>max){
             max=b;
         }
         if (c>a) {
             max=c;
         }
        System.out.println(max);
    }
}
