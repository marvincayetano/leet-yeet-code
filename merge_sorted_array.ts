/**
 Do not return anything, modify nums1 in-place instead.
 */
function merge(nums1, m, nums2, n) {
  while (n) {
    console.log(nums1);
    // m = values available in nums1
    // n = values available in nums2
    // m + n is the length of nums1

    // We're starting from the back m - 1
    // 1 2 3 0 0 0

    //     ^ if this value is greater than 6 of nums 2
    if (nums1[m - 1] > nums2[n - 1]) {
      // put it in the last index, last index = m + n - 1
      nums1[m + n - 1] = nums1[--m];
    } else {
      nums1[m + n - 1] = nums2[--n];
    }
  }
}

const nums1 = [1, 2, 3, 0, 0, 0],
  m = 3,
  nums2 = [2, 5, 6],
  n = 3;
merge(nums1, m, nums2, n);
