public class minmaxarray {

    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i<array.length;i++){
            if(array[i] < min) min = array[i];
            if(array [i] > max) max = array [i];
            

        }
        System.out.println("Minimum :"+min);
        System.out.println("Maximum :"+max);
    }
}