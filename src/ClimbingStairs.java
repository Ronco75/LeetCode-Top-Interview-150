public class ClimbingStairs {
    private int[] memo;

    public int climbStairs(int n) {
        memo = new int[n + 1];
        return climbStairsMemo(n);
    }

    private int climbStairsMemo(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = climbStairsMemo(n - 1) + climbStairsMemo(n - 2);
        return memo[n];
    }
}
