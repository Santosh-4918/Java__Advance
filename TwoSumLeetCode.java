public class TwoSumLeetCode {
    public int[] twoSum(int[] numbers, int target){
        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return new int []{-1,-1};

    }
    public static void main(String[] args) {
        TwoSumLeetCode solution = new TwoSumLeetCode();
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum(numbers,target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
    
}
