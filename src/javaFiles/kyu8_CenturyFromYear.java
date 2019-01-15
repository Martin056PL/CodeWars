package javaFiles;/*Introduction

The first century spans from the year 1 up to and including the year 100, The second - from the year 101 up to and including the year 200, etc.
Task :

Given a year, return the century it is in.
Input , Output Examples ::

centuryFromYear(1705)  returns (18)
centuryFromYear(1900)  returns (19)
centuryFromYear(1601)  returns (17)
centuryFromYear(2000)  returns (20)

Hope you enjoy it .. Awaiting for Best Practice Codes

Enjoy Learning !!!
*/

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
