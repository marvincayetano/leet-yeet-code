/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */

// SHORT SOLUTION WITH THE SUBSTRING
var strStr = function (haystack, needle) {
  if (needle.length === 0) return 0;

  if (needle === haystack) return 0;

  for (let i = 0; i <= haystack.length - needle.length; i++) {
    if (needle === haystack.substring(i, i + needle.length)) {
      return i;
    }
  }

  return -1;
};

// LONG SOLUTION WITHOUT THE SUBSTRING
var strStr = function (haystack, needle) {
  // Input: Hello
  // Needle: ll

  // Goal: TO FIND THE INDEX OF THE NEEDLE

  // Constraints
  // Haystack can be 0
  // Neddle

  // Code for constrains
  if (needle === "") return 0;
  if (haystack === "") return -1;

  // What I'm thinking is we make the needle an array
  // Then have an index counter that will check each loop
  // Making sure the loop is continuosly done without wrong character

  // Loop through the haystack
  // Check for needle character repeat until finished looping through
  let returnIndex = -1;

  for (let i = 0; i < haystack.length; i++) {
    // Make sure it's looping through all
    // Check if the letter now is the same as the current index of needle
    if (needle[0] === haystack[i]) {
      // Loop through all the needle and check if it is continuos

      // Set the index
      returnIndex = i;

      // H E L L L O
      //     ^ We already checked this so we go to the next one
      // H E L L L O
      //       ^ We already checked this so we go to the next one
      let counter = needle.length - 1;
      for (let j = 1; j < needle.length; j++) {
        // If everything goes fine
        // We should be able to loop all the needle
        if (needle[j] !== haystack[j + i] || counter === 0) {
          // Otherwise we have to do it again
          // But we have to continue where we left off
          // Meaning we have to add our j to i

          // Break to the i
          break;
        }

        counter -= 1;
      }

      // 0 meaning we were able to loop all
      if (counter === 0) {
        // so we're returning the index where we match the first characters
        return returnIndex;
      }

      // Set the i to default not found
      returnIndex = -1;
    }

    // This means we didn't find it
  }

  return returnIndex;
};
