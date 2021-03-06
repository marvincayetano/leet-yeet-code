// Given an integer array nums, return the length of the longest strictly increasing subsequence.

// A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].



// Example 1:

// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
// Example 2:

// Input: nums = [0,1,0,3,2,3]
// Output: 4
// Example 3:

// Input: nums = [7,7,7,7,7,7,7]
// Output: 1


// Constraints:

// 1 <= nums.length <= 2500
// -104 <= nums[i] <= 104


// Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?

// Accepted
// 924,812
// Submissions
// 1,845,983

// 45%
class Solution {
   public int lengthOfLIS(int[] nums) {
    if(nums==null || nums.length==0)
        return 0;

    int[] max = new int[nums.length];
    Arrays.fill(max, 1);

    int result = 1;
    for(int i=0; i<nums.length; i++){
        for(int j=0; j<i; j++){
            if(nums[i]>nums[j]){
                max[i]= Math.max(max[i], max[j]+1);

            }
        }
        result = Math.max(max[i], result);
    }

   return result;
}
}

// 88% binary search
class Solution {
   public int lengthOfLIS(int[] nums) {
    if(nums==null || nums.length==0)
        return 0;

    ArrayList<Integer> list = new ArrayList<>();

    for(int num: nums){
        if(list.size()==0 || num>list.get(list.size()-1)){
            list.add(num);
        }else{
            int i=0;
            int j=list.size()-1;

            while(i<j){
                int mid = (i+j)/2;
                if(list.get(mid) < num){
                    i=mid+1;
                }else{
                    j=mid;
                }
            }

            list.set(j, num);
        }
    }

    return list.size();
}

}

// 99% binary search
class Solution {
  public int lengthOfLIS(int[] nums) {
    int[] dp = new int[nums.length];
    int len = 0; // len of sequence

    for(int num: nums){
        int idx = Arrays.binarySearch(dp, 0, len, num);

        //if not found, return binarySearch return -insertPosition-1
        if(idx < 0){
            idx = - (idx + 1);
        }

        dp[idx] = num;

        //update len when insert position is at the end
        if(idx==len){
            len++;
        }
    }

    return len;
}

}