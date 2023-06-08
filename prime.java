import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= in.nextInt();
        int c=2;
        while(c<n){
            if (n%c==0){
                System.out.println("Not Prime");
                return;
            }
            c=c+1;
        }
        if (c*c>n){
            System.out.println("prime");
            return;
        }
    }
}
