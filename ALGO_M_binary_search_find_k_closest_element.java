// Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

// An integer a is closer to x than an integer b if:

// |a - x| < |b - x|, or
// |a - x| == |b - x| and a < b


// Example 1:

// Input: arr = [1,2,3,4,5], k = 4, x = 3
// Output: [1,2,3,4]
// Example 2:

// Input: arr = [1,2,3,4,5], k = 4, x = -1
// Output: [1,2,3,4]


// Constraints:

// 1 <= k <= arr.length
// 1 <= arr.length <= 104
// arr is sorted in ascending order.
// -104 <= arr[i], x <= 104
// Accepted
// 306,586
// Submissions
// 684,603

// 65%
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i = 0, j = arr.length - k;
        while (i < j){
            int mid = (i & j) + ((i ^ j) >> 1);
            // int mid = i + (j - i >> 1);
            if(x - arr[mid] > arr[mid + k] - x)
                i = mid + 1;
            else
                j = mid;
        }
        List<Integer> res = new ArrayList<>();
        for (int b = i; b < i + k; ++b) res.add(arr[b]);
        return res;
        // return Arrays.stream(Arrays.copyOfRange(arr, i, i + k)).boxed().collect(Collectors.toList());

    }
}