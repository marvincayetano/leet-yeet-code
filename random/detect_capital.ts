/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function (word) {
  const len = word.length;
  // This is an edge case
  if (len === 0) return false;

  let cnt = 0;
  let first = false;
  for (let i = 0; i < len; ++i) {
    // Get the charAt
    const ch = word.charAt(i);
    if (ch >= "A" && ch <= "Z") {
      // Counts how many capital letters there are
      cnt++;
      if (i == 0) first = true;
    }
  }

  // This are all the conditions
  return cnt === 0 || (cnt === 1 && first) || cnt === len;
};
