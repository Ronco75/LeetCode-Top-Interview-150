import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> sChars = new HashMap<>();
        HashMap<Character, Integer> tChars = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(!sChars.containsKey(s.charAt(i))) {
                sChars.put(s.charAt(i), i);
            }
            if(!tChars.containsKey(t.charAt(i))) {
                tChars.put(t.charAt(i), i);
            }
            if (!sChars.get(s.charAt(i)).equals(tChars.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
