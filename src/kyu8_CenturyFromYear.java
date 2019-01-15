public class kyu8_CenturyFromYear {

    public static void main(String[] args) {
        int year = 1763;
        century(year);
    }

    public static int century(int number) {
        int result;
        if(number%100 != 0) result = (number/100)+1;
        else result = (number/100);
        return result;
    }
}
