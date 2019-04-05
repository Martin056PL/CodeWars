/*Write a function:
class Solution {public int solution(int[] A);}
that,given an array A of N integers,returns the smallest positive
integer(greater than 0)that does not occur in A.
For example,given A=[1,3,6,4,1,2],the function should
return 5.
Given A=[1,2,3],the function should return 4.
Given A=[−1, −3],the function should return 1.
Write an efficient algorithm for the following assumptions:
N is an integer within the range[1..100,000];
each element of array A is an integer within the range
[−1,000,000..1,000,000].*/

import java.util.*;

class MyKata_MissingInteger {
    int solution(int[] A) {
        Arrays.sort(A);
        Integer result = null;
        for (int i = 0; i < A.length; i++) {
            if (i == A.length - 1 && A[A.length - 1] > 0) {
                result = A[A.length - 1] + 1;
                break;
            } else if (i == A.length - 1 && A[A.length - 1] < 0) {
                result = 1;
                break;
            }
            if (A[i] < 0 || A[i] == A[i + 1]) {
                continue;
            } else if (A[i + 1] != A[i] + 1) {
                result = A[i] + 1;
                break;
            }
        }
        return result;
    }
}
