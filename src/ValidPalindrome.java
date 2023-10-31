public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedStr += s.charAt(i);
        }
        return s.equals(reversedStr);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
