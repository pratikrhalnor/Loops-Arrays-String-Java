public class SecondLargest{
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int max = array[0], secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second largest element: " + secondMax);
}
}
