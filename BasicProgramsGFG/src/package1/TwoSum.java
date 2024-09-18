package package1;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the complement and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // Store the number and its index in the map
            map.put(nums[i], i);
        }

        // If no solution is found (though the prompt guarantees a solution)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Get the result
        int[] result = twoSum(nums, target);

        // Print the result
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

