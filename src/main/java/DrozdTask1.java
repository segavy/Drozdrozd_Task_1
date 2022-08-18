public class DrozdTask1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 5, 6, 4, 0, 3};
        int max = nums[0];
        int maxIndex = 0;
        int min = nums[0];
        int minIndex = 0;
        int sum = 0;

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

        if (maxIndex > minIndex) {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                sum += nums[i];
            }
        } else
            if (maxIndex < minIndex) {
                for (int i = maxIndex + 1; i < minIndex; i++) {
                    sum += nums[i];
                }
            }

        System.out.println("Min number: " + min + " , index: " + minIndex);
        System.out.println("Max number: " + max + " , index: " + maxIndex);
        System.out.println("Sum is " + sum);

    }
}
