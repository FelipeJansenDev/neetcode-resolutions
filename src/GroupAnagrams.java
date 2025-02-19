import java.util.*;

// Group Anagrams
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[] {"felipe", "teste", "epilef", "eiplef", "carro", "orrac"};
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String orderedWord = new String(letters);
            map.putIfAbsent(orderedWord, new ArrayList<>());
            map.get(orderedWord).add(word);
        }
        System.out.println(map.values().stream().toList());
    }
}
