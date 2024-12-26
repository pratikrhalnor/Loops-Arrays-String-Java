public class Sum2DArray{
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = sum2Darray(array);

System.out.println("Sum of 2D array is " +sum);

    } 
     public static int sum2Darray(int [][] array){

        int sum =  0;
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
          sum += array[i][j];
          }
        }
        return sum;
    }

}