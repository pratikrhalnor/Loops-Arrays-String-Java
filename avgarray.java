public class avgarray {
    public static void main(String args []){
        int [] array = {10,20,20,40};
        double avrg = calculateAvreage(array);
        System.out.println("Avreage " +avrg);


    }
    public static double calculateAvreage(int [] array){
        int sum = 0 ;
        for (int num : array ){
            sum += num;

        }
           return (double) sum / array.length;
    }
}
