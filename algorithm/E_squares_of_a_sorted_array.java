// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



// Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]


// Constraints:

// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums is sorted in non-decreasing order.


// Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
// Accepted
// 1,109,525
// Submissions
// 1,546,332

// 23%
class Solution {
    public int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;

    }
}

// 86% pointers
class Solution {
    public int[] sortedSquares(int[] A) {

        int[] result = new int[A.length];
        int s = 0;
        int i = 0;
        int j = 0;
for (int k = 0; k < A.length; k++) {
            if (A[k] < 0) {
                j++;
            }
            A[k] = A[k] * A[k];
        }
        i = j -1;
        while (i >= 0 && j <= A.length - 1) {
            if (A[i] < A[j]) {
                result[s] = A[i];
                i--;
            } else {
                result[s] = A[j];
                j++;
            }
            s++;
        }
        while (i >= 0) {
            result[s] = A[i];
            i--;
            s++;
        }
        while (j <= A.length - 1) {
            result[s] = A[j];
            j++;
            s++;
        }
        return result;
    }
}