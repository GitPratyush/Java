import java.util.Scanner;

public class salaryIncrement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your current salary:");
        int salary= in.nextInt();
        if (salary<=10000){
            salary+=2000;
        } else if (salary>=10000 && salary<=20000) {
            salary+=1000;
        }
        else {
            salary+=500;
        }
        System.out.println("Your Incresed salery is: "+salary);
    }
}
