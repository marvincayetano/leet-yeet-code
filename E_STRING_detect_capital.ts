// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

//
function detectCapitalUse(word: string): boolean {
  // Constraint where all capital is valid
  if (word.toUpperCase() === word) {
    return true;
  }

  if (word.length === 0) {
    return false;
  }

  return word[0] !== word[0].toLowerCase();
}
