public class kyu8_OppositesAttract {

    public static void main(String[] args) {

        int flower1 = 4;
        int flower2 = 7;
        isLove(flower1,flower2);
    }

    public static boolean isLove(final int flower1, final int flower2) {
        boolean result = false;
        int sum = flower1+flower2;
        if(sum%2!=0) result = true;
        return result;
    }
}
