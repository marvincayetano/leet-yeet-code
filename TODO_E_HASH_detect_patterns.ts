// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false
// Example 3:

// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false

// Constraints:

// 1 <= pattern.length <= 300
// pattern contains only lower-case English letters.
// 1 <= s.length <= 3000
// s contains only lowercase English letters and spaces ' '.
// s does not contain any leading or trailing spaces.
// All the words in s are separated by a single space.

function wordPattern(pattern: string, s: string): boolean {
  const map = new Map();

  // split the sentence to words
  const words = s.split(" ");
  const patterns = pattern.split("");

  if (words.length !== patterns.length) {
    return false;
  }

  console.log(words);
  console.log(patterns);
  for (let i = 0; i < words.length; i++) {
    // If pattern already exist
    const tempPattern = patterns[i];
    const tempWord = map.get(tempPattern);
    if (tempWord !== undefined && tempWord !== words[i]) {
      return false;
    } else {
      map.set(tempPattern, words[i]);
    }
  }

  return true;
}

wordPattern("abba", "dog cat cat dog");
