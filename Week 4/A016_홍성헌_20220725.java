import java.util.*;

class Solution {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;
        int min = 0;
        int max = people.length - 1;

        while (min <= max) {
            if (people[min] + people[max] <= limit) ++min;
            --max;
            ++answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println(solution(people, limit));
    }
}