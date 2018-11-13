package Basic;

public class Program {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(findLargestNum(array));
    }

    public static int findLargestNum(int[] nums) {
        int lowestNumber = nums[0];
        for (int number : nums) {
            if (number < lowestNumber) {
                lowestNumber = number;
            }

        }

        return lowestNumber;
    }
}