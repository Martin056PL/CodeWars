package javaFiles;/*Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
 If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
*/

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
