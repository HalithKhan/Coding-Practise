public class MergeSortedArrays {
    // Merge two sorted arrays into one sorted array
    public int[] merge(int[] arr1, int[] arr2) {
        // TODO: Implement merging logic
        return new int[0];
    }

    public static void main(String[] args) {
        MergeSortedArrays msa = new MergeSortedArrays();
        int[] merged = msa.merge(new int[]{1,3,5}, new int[]{2,4,6});
        for (int i : merged) {
            System.out.print(i + " ");
        }
    }
}