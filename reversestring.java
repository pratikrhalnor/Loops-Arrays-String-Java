public class reversestring {
    public static void main(String[] args) {
     String orignalString = "HELLO PRATIK ";
     String reversedString = new StringBuilder(orignalString).reverse().toString();

     System.out.println("Orignal String :"+orignalString);
     System.out.println("Reversed String :" +reversedString);
     }
}
