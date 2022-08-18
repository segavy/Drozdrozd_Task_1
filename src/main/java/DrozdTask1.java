public class DrozdTask1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 5, 6, 4, 0, 3};
        int max = nums[0];
        int maxIndex = 0;
        int min = nums[0];
        int minIndex = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }

            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }

        if (maxIndex > minIndex) result = sum(nums, minIndex, maxIndex);
        else
            if (maxIndex < minIndex) result = sum(nums, maxIndex, minIndex);

        System.out.println("Min number: " + min + " , index: " + minIndex);
        System.out.println("Max number: " + max + " , index: " + maxIndex);
        System.out.println("Sum is " + result);
    }

    static int sum (int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start + 1; i < end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
