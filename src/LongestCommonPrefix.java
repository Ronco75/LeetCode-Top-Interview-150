public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        String ref = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < ref.length() && j < strs[i].length() && ref.charAt(j) == strs[i].charAt(j)){
                j++;
            }
            ref = ref.substring(0, j);
        }
        return ref;
    }

}
