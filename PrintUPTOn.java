import java.util.Scanner;

public class PrintUPTOn {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the starting value: ");
        int a=in.nextInt();
        System.out.print("Enter the Ending value");
        int b=in.nextInt();
        for (int num=a; num<=b;num+=1){
            System.out.println(num);
        }
    }
}
