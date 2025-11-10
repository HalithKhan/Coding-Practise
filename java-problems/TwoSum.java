public class TwoSum {
    // Given an array of integers and a target, return indices of two numbers such that they add up to target.
    public int[] findTwoSum(int[] nums, int target) {
        // TODO: Implement the logic
        return new int[0];
    }

    public static void main(String[] args) {
        // Example usage:
        TwoSum ts = new TwoSum();
        int[] indices = ts.findTwoSum(new int[]{2, 7, 11, 15}, 9);
        // Print output
        for (int i : indices) {
            System.out.print(i + " ");
        }
    }
}