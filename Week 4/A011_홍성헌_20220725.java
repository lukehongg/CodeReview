import java.util.*;

public class Solution {

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Info> infos = new ArrayList<>(N);
        int[] arr = new int[N + 2];
        for (int stage : stages) {
            arr[stage]++;
        }
        int total = stages.length;

        for (int i = 1; i < N + 1; i++) {
            if (total != 0) {
                infos.add(new Info((double) arr[i] / total, i));
                total -= arr[i];
            } else {
                infos.add(new Info(0.0, i));
            }
        }
        Collections.sort(infos);

        for (int i = 0; i < N; i++) {
            answer[i] = infos.get(i).index;
        }
        return answer;
    }

    private static class Info implements Comparable<Info> {
        double value;
        int index;

        public Info(double value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Info o) {
            if (this.value == o.value) {
                return this.index - o.index;
            }
            return (-1) * Double.compare(this.value, o.value);
        }
    }
}