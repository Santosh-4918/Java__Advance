import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        // int[] nums1 = {1, 2, 3, 4};
         int[] nums2 = {1, 2, 3, 1};

        //System.out.println(containsDuplicate(nums1)); // false
         System.out.println(containsDuplicate(nums2)); // true
    }
}