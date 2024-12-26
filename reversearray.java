public class reversearray {
public static void main(String args[]){
    int [] array = {1,2,3,4,5};
    System.out.println("Orignal array : ");
    printArray(array);

    reverseArrray(array);
    System.out.println("Reversed array : " );
    printArray(array);

}
public static void reverseArrray( int [] array){
     int left = 0;
     int right = array.length - 1;
     while (left <right){
        int temp = array[left];
        array[left] =array[right];
        array[right] = temp;
     left++;
     right--;

     }
}
public static void printArray(int[] array){
    for(int i = 0; i < array.length; i++){
        System.out.println(array[i]+" ");

    }
    
}

}