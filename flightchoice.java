import java.util.Scanner;
public class flightchoice {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
    
        while(true){
            System.out.println("Please enter your flight choice (1-5): ");
            int FlightChoice = pr.nextInt();

            if( FlightChoice >=1 && FlightChoice <=5){
            System.out.println("You have chosen flight No : "+FlightChoice);
            break; 
            }
            else {
                System.out.println("Invalid choice ");
            }
            pr.close();

        }
    }
}
