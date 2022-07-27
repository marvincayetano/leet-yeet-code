// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.


// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000


// Follow up:

// What if the given array is already sorted? How would you optimize your algorithm?
// What if nums1's size is small compared to nums2's size? Which algorithm is better?
// What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
// Accepted
// 842,424
// Submissions
// 1,526,179

// 46%
public int[] intersect(int[] nums1, int[] nums2) {

        if(nums1 == null || nums2 == null || nums1.length==0  || nums2.length==0)
            return new int[0];
        // step1: Put elements in nums1 into the map
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums1)
            if(map.containsKey(num))
                map.put(num,map.get(num)+1);
            else
                map.put(num,1);
// step 2: iterate the nums2 and get the result
        List<Integer> result = new ArrayList<>();

            for (int num : nums2) {
                if (map.containsKey(num) && map.get(num) > 0)
                {   result.add(num);
                    int freq = map.get(num);
                    freq--;
                    map.put(num, freq);
            }
        }

        return listToArray(result);
    }

    private int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }


// 85%
class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
    Arrays.sort(nums2);
    ArrayList<Integer> list = new ArrayList<Integer>();
    int p1=0, p2=0;
    while(p1<nums1.length && p2<nums2.length){
        if(nums1[p1]<nums2[p2]){
            p1++;
        }else if(nums1[p1]>nums2[p2]){
            p2++;
        }else{
            list.add(nums1[p1]);
            p1++;
            p2++;

        }
    }

    int[] result = new int[list.size()];
    int i=0;
    while(i<list.size()){
        result[i]=list.get(i);
        i++;
    }
    return result;
    }

}