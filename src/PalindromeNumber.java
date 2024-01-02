public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int num = 0;
        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            num = num * 10 + digit;
            temp /= 10;
        }

        return num == x;
    }

}
