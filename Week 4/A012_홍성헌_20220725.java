import java.util.*;
class Solution {
    public int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i * i < n; i++) {
            if (isNotPrime[i]) continue;

            for (int j = 2; i * j < n; j++) {
                isNotPrime[i * j] = true;
            }
        }

        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;
            }
        }

        return count;
    }
}