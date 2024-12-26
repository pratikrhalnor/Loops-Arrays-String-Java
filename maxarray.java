public class maxarray {
    public static void main(String[]args){
        int [] array = {10,20,30,40};
        System.out.println("Maximum is : " +findMax(array));
        
            }
        
        
            public static int findMax(int[] array) {
               int max = array[0];
               for (int i : array ){
               if (i > max ){
                   max = i;

                }
               } 
               return max;

            }
}
