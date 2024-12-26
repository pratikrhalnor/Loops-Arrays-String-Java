import java.util.Scanner;

public class negative {
    public static void main(String[] args) {
        Scanner pr =new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter the number (Negative Number to Quit):");
            number = pr.nextInt();
            System.out.println("You Entered: "+number);

        } while(number>=0);
        System.out.println("Thankyou For playing Goodbye ");
        pr.close();

    }
}
