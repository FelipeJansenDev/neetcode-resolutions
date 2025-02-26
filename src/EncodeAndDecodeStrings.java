import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("neet");
        list.add("code");
        list.add("love");
        list.add("you");

        // Enconding
        StringBuilder encoded = new StringBuilder();
        for(String word : list) {
            encoded.append(word.length()).append('#').append(word);
        }
        System.out.println(encoded);

        // Decoding
        int i = 0;
        StringBuilder charNumberStringBuilder = new StringBuilder();
        List<String> word = new ArrayList<>();
        while (i < encoded.toString().length()) {
            if (encoded.charAt(i) == '#') {
                word.add(encoded.substring(i + 1, i + 1 + Integer.parseInt(charNumberStringBuilder.toString())));
                i += 1 + Integer.parseInt(charNumberStringBuilder.toString());
                charNumberStringBuilder = new StringBuilder();
            } else {
                charNumberStringBuilder.append(encoded.charAt(i));
                i++;
            }
        }
        System.out.println(word);
    }
}
