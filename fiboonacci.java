public class fiboonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.println("The first number 10 number of Fibonacci series is :");
        System.out.println(num1 + " " + num2);
        for(int i = 3; i <=10; i++){
            int sum = num1+num2;
            System.out.println(" " +sum);
            num1 = num2 ;
            num2 =sum ;
            

       }

    }
}
