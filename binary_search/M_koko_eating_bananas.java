// Koko can only eat certain numbers of bananas per hour = h
// Koko can eat all piles of bananas in H hours
// We are looking for the minimum k value which is how many bananas Koko can eat
// per hour per pile h = total hours to eat all piles
// We need to round up the result of hours to eat A pile
// We can use left and right pointers to find the minimum k value

class Solution {

  public int minEatingSpeed(int[] piles, int h) {
    // Initalize the left and right boundaries
    // because the input in not sorted
    // We can set the left boundary to 1 because we are looking for the minimum
    // Maximum = right = the max number in piles if the hour = h is only 1
    int left = 1, right = 1;
    for (int pile : piles) {
      right = Math.max(right, pile);
    }

    while (left < right) {
      // Get the middle index between left and right boundary indexes.
      // hourSpent stands for the total hour Koko spends.
      int middle = (left + right) / 2;
      int hourSpent = 0;

      // Iterate over the piles and calculate hourSpent.
      // We increase the hourSpent by ceil(pile / middle)
      for (int pile : piles) {
        hourSpent += Math.ceil((double) pile / middle);
      }

      // Check if middle is a workable speed, and cut the search space by half.
      // If middle is less than the hour spent we need to find a less middle
      if (hourSpent <= h) {
        right = middle;
      } else {
        // Otherwise if the hour spent is greater than h we need to find a bigger
        // appetite lol
        left = middle + 1;
      }
    }

    // Once the left and right boundaries coincide, we find the target value,
    // that is, the minimum workable eating speed.
    return right;
  }
}