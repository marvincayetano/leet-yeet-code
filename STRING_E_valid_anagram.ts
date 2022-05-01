// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.

// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

// function isAnagram(s: string, t: string): boolean {
//   // they are always lowercase
//   let len = s.length,
//     fMap = new Int16Array(123);

//   // First is what are the constraints
//   // s & t lengths are between 1 and 5 * 10^4
//   // Well if they are not the same length, no further loops needed
//   if (t.length !== len) return false;

//   for (let i = 0; i < len; i++) fMap[s.charCodeAt(i)]++;
//   for (let i = 0; i < len; i++) if (--fMap[t.charCodeAt(i)] < 0) return false;
//   return true;
// }

function isAnagram(s: string, t: string): boolean {
  // they are always lowercase
  let len = s.length;
  let fMap = {};

  // First is what are the constraints
  // s & t lengths are between 1 and 5 * 10^4
  // Well if they are not the same length, no further loops needed
  if (t.length !== len) return false;

  for (let i = 0; i < len; i++) fMap[s.charCodeAt(i)] += 1;
  for (let i = 0; i < len; i++) {
    fMap[t.charCodeAt(i)] -= 1;
    if (fMap[t.charCodeAt(i)] < 0) {
      return false;
    }
  }
  return true;
}
