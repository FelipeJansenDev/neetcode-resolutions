import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKElements {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,3,3,3,3};
        int k = 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : nums) {
            map.put(number,  map.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> element : map.entrySet()) {

        }

        System.out.println(map.entrySet());
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
