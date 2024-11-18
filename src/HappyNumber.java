import java.util.ArrayList;

class Solution {
    public boolean HappyNumber(int n) {

        ArrayList<Integer> checked = new ArrayList<>();
        while (n != 1) {
            int temp = 0;
            while (n != 0) {
                int firstDigit = n % 10;
                temp += (firstDigit * firstDigit);
                n /= 10;
            }
            n = temp;
            if (checked.contains(n)) {
                return false;
            }
            checked.add(n);
        }
    return true;
    }
}