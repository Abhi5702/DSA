public class MaxSubArray {

    public int maxSubArray(int[] a) {
        int currSum = 0;
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            currSum = currSum + a[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = maxSubArray.maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

