/*In this little assignment you are given a string of space separated numbers,
 and have to return the highest and lowest number.

Example:

HighAndLow("1 2 3 4 5")  // return "5 1"
HighAndLow("1 2 -3 4 5") // return "5 -3"
HighAndLow("1 9 3 4 -5") // return "9 -5"

Notes:
    All numbers are valid Int32, no need to validate them.
    There will always be at least one number in the input string.
    Output string must be two numbers separated by a single space, and highest number is first.
*/

public class kyu7_HighestAndLowest {

    public static void main(String[] args) {
        String numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        HighAndLow(numbers);
    }

    public static String HighAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int max = Integer.parseInt(array[0]);
        int min = Integer.parseInt(array[0]);

        for (String i : array) {
            int number = Integer.parseInt(i);
            if (number < min) min = number;
            if (number > max) max = number;
        }
        String result = max + " " + min;
        return result;
    }
}
