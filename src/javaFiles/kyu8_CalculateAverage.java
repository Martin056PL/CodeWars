package javaFiles;// Write function avg which calculates average of numbers in given list.

public class kyu8_CalculateAverage {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        find_average(array);
    }

    public static double find_average(int[] array) {

        int sum = 0;
        double result;
        for (int i : array) {
            sum += i;
        }
        result = (double) sum / array.length;
        return result;
    }
}
