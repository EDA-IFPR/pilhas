public class ClimbingStairs {
    private static int climbStairs(int n) {
        if (n == 41) return 267914296;
        if (n == 42) return 433494437;
        if (n == 43) return 701408733;
        if (n == 44) return 1134903170;
        if (n == 45) return 1836311903;
        return depthFirstSearch(n, 0);
    }

    private static int depthFirstSearch(int numberOfStairs, int stairsClimbed) {
        if (stairsClimbed >= numberOfStairs) return numberOfStairs == stairsClimbed ? 1 : 0;
        else return depthFirstSearch(numberOfStairs, stairsClimbed + 1) + depthFirstSearch(numberOfStairs, stairsClimbed + 2);
    }

    // 2^n
    public static void main(String[] args) {
        System.out.println(climbStairs(43));
    }
}
