public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = getValue(currentChar);

            if (i < s.length() - 1) {
            // if i < s.length() - 1 it means there is a next character to consider.
                char nextChar = s.charAt(i + 1);
                int nextValue = getValue(nextChar);
                if (currentValue < nextValue) {
                    result += (nextValue - currentValue);
                    i++;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }
    return result;
    }

    public static int getValue(char r) {
        return switch (r) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
