public class kyu8_SimpleMultiplication {

    public static void main(String[] args) {
        int n = 10;
        simpleMultiplication(n);
    }

    public static int simpleMultiplication(int n) {
        int result = 0;
        //your code here
        if (n % 2 == 0) {
            result = n * 8;
        } else {
            result = n * 9;
        }
        return result;
    }
}

