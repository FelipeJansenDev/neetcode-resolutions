import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        int[] nums = new int[]{7,7};
        int k = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : nums) {
            map.put(number,  map.getOrDefault(number, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            list.add(new int[]{element.getValue(), element.getKey()});
        }

        list.sort((a, b) -> b[0] - a[0]);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            System.out.println(list.get(i)[1]);
            result[i] = list.get(i)[1];
        }
    }
}
