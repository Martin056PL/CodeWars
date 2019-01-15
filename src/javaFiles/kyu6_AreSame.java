package javaFiles;

import java.util.Arrays;

/*
Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
Examples
Valid arrays

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]

comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]

Invalid arrays

If we change the first number to something else, comp may not return true anymore:

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]

comp(a,b) returns false because in b 132 is not the square of any number of a.

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]

comp(a,b) returns false because in b 36100 is not the square of any number of a.
Remarks

a or b might be [] (all languages except R, Shell). a or b might be nil or null or None or nothing (except in Haskell, Elixir, C++, Rust, R, Shell).

If a or b are nil (or null or None), the problem doesn't make sense so return false.

If a or b are empty the result is evident by itself.

 */

public class kyu6_AreSame {

    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        comp(a, b);
    }

    public static boolean comp(int[] a, int[] b) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder5 = new StringBuilder();
        StringBuilder stringBuilder6 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        StringBuilder stringBuilder4 = new StringBuilder();

        if (a == null || b == null) return false;
        if (a.length == 0 && b.length == 0) return true;

        int aLength = a.length;
        int bLength = b.length;
        int j = 0;
        boolean isTheSame = false;
        boolean result;

        for (int i = 0; i < aLength; i++) {
            stringBuilder1.append(a[i] + " ");
        }
        //System.out.println(stringBuilder1.toString());

        for (int i = 0; i < bLength; i++) {
            stringBuilder2.append(b[i] + " ");
        }
        //System.out.println(stringBuilder2.toString());

        for (int i = 0; i < aLength; i++) {
            a[i] = Math.abs(a[i]);
            stringBuilder5.append(a[i] + " ");
        }
        //System.out.println(stringBuilder5.toString());

        for (int i = 0; i < bLength; i++) {
            b[i] = Math.abs(b[i]);
            stringBuilder6.append(b[i] + " ");
        }
        //System.out.println(stringBuilder6.toString());

        //System.out.println("\nRozmiar tablicy a: " + aLength);
        //System.out.println("Rozmiar tablicy b: " + bLength + "\n");


        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < aLength; i++) {
            a[i] = Math.abs(a[i]);
            Arrays.sort(a);
            stringBuilder3.append(a[i] + " ");
        }
        //System.out.println(stringBuilder3.toString());

        for (int i = 0; i < bLength; i++) {
            b[i] = Math.abs(b[i]);
            stringBuilder4.append(b[i] + " ");
        }
        //System.out.println(stringBuilder4.toString() + "\n");

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < aLength; i++) {
            //System.out.println("Numer sprawdzenia: " + i);
            //System.out.println("Mnożeie elementu " + i + " (" + a[i] + ")" + " z tablicy a: " + a[i] * a[i] + " oraz elementu " + j + " z bablicy b: " + b[j]);
            if ((a[i] * a[i]) == b[j]) {
                //System.out.println("Obecny indeks a: " + i + " Obecny indeks b: " + j);
                isTheSame = true;
                //System.out.println("Czy zgadza sie?: " + isTheSame);
            } else {
                isTheSame = false;
                //System.out.println(isTheSame);
                break;
            }
            j++;
        }

        System.out.println("Are arrays the same?: " + isTheSame);
        result = isTheSame;
        return result;
    }
}
