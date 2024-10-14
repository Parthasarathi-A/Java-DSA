public class samplecode {
    public int maxSubarray(int A, int B, int[] C) {
        int s = 0;
        int e = 0;
        int sum = 0;
        int max_sum = 0;   
        while (e < A) {
            sum += C[e];
            while (sum > B) {
                sum -= C[s];
                s++;
            }
            max_sum = Math.max(max_sum, sum);
            e++;
        }
        return max_sum;
    }
    public static void main(String[] args) {
        samplecode solution = new samplecode();
        int A = 5;
        int B = 12;
        int[] C = {2, 1, 3, 4, 5};
        int result = solution.maxSubarray(A, B, C);
        System.out.println(result); // Output the maximum sum that does not exceed B
    }
}