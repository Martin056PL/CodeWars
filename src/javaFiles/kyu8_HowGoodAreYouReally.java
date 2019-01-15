package javaFiles;/*There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.
You got an array with your colleges' points. Now calculate the average to your points!

Return True if you're better, else False!
Note:

Your points are not included in the array of your classes points. For calculating the average point you may add your point to the given array!
*/

public class kyu8_HowGoodAreYouReally {

    public static void main(String[] args) {
        int [] classPoints =  {100, 40, 34, 57, 29, 72, 57, 88};
        int yourPoints = 75;
        betterThanAverage(classPoints,yourPoints);
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        boolean result = false;
        int sum = 0;
        double avr = 0;
        double my = yourPoints;
        for (int i : classPoints) {
            sum += i;
        }

        avr = (double) sum / classPoints.length;

        if (avr < my) result = true;
        return result;
    }
}
