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
