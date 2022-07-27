// In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in his new invented basket. Rick has n empty baskets, the ith basket is at position[i], Morty has m balls and needs to distribute the balls into the baskets such that the minimum magnetic force between any two balls is maximum.

// Rick stated that magnetic force between two different balls at positions x and y is |x - y|.

// Given the integer array position and the integer m. Return the required force.



// Example 1:


// Input: position = [1,2,3,4,7], m = 3
// Output: 3
// Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
// Example 2:

// Input: position = [5,4,3,2,1,1000000000], m = 2
// Output: 999999999
// Explanation: We can use baskets 1 and 1000000000.


// Constraints:

// n == position.length
// 2 <= n <= 105
// 1 <= position[i] <= 109
// All integers in position are distinct.
// 2 <= m <= position.length
// Accepted
// 30,886
// Submissions
// 55,105

// 78% binary search solution
class Solution {
    public int maxDistance(int[] p, int m) {
        Arrays.sort(p);
        int n = p.length, l = 1, r = p[n - 1] - p[0];

        while(l < r - 1) {
            int mid = l + (r - l) / 2;
            if(check(p, mid, m)) {
                l = mid;
            }
            else {
                r = mid - 1;
            }
        }
        if(check(p, r, m)) {
            return r;
        }
        return l;
    }
    // check if m items can be placed with minimum distance minD
    private boolean check(int[] p, int minD, int m) {
        int cnt = 1;
        int next = p[0] + minD;
        for(int i = 1; i < p.length; i++) {
            if(p[i] >= next) {
                cnt++;
                next = p[i] + minD;
            }
        }
        return cnt >= m;
    }
}