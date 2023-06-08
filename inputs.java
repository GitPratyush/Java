import java.util.Scanner;

public class inputs {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno=input.nextInt();
        System.out.println("Your roll number is :"+ rollno);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Your name is : "+name);
    }
}
