public class MaxMinArray {
    public static void main(String[] args) {

        int[] array = {7, 0, 9, 1, 4, 6, -1};

        int min = array[0];
        int max = array[0];

        for (int i =1; i<array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
