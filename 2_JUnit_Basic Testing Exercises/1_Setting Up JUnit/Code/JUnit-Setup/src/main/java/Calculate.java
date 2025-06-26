public class Calculate {
    int sum(int[] nums) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        return sum;
    }

    int product(int[] nums) {
        int prod = 1;
        for (int num: nums) {
            prod *= num;
        }
        return prod;
    }
}

