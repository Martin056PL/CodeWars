public class kyu7_AlphabeticalAddition {

    public static void main(String[] args) {
        addLetters("z", "z");
    }

    private static String addLetters(String... letters) {

        if (letters.length == 0) return "z";

        final int shift = 96;
        final int asciiForZ = 122;
        int sum = 0;
        int asciiResult;

        for (String letter : letters) {
            char[] chars = letter.toCharArray();
            int value = chars[0] - shift;
            sum = sum + value;
        }

        int division = sum % 26;

        if (division != 0)
            asciiResult = division + shift;
        else
            asciiResult = asciiForZ;

        char charResult = (char) asciiResult;
        return String.valueOf(charResult);
    }
}
