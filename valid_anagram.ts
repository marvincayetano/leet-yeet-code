/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */

//  An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Input: s = "anagram", t = "nagaram"
// Output: true

// First solution I could think of is using Object with value num
// Hashmap

function isAnagram(s: string, t: string): boolean {
  // First is what are the constraints
  // s & t lengths are between 1 and 5 * 10^4
  // they are always lowercase

  const hashMap: any = {};
  for (const letter of s) {
    if (hashMap[letter] === undefined) {
      hashMap[letter] = 1;
    } else {
      hashMap[letter] += 1;
    }
  }

  for (const letter of t) {
    if (hashMap[letter] !== undefined) {
      hashMap[letter] -= 1;
    } else {
      hashMap[letter] = -1;
    }
  }

  for (const value of Object.values(hashMap)) {
    if (value !== 0) {
      return false;
    }
  }

  return true;
}

// Short solution
function isAnagram(s: string, t: string): boolean {
  // First is what are the constraints
  // s & t lengths are between 1 and 5 * 10^4
  // they are always lowercase
}
