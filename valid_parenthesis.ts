// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.

function isValid(s: string): boolean {
  // This is really easy
  // Contraints first

  // Can't have closing tag
  if (s.length === 1) return false;

  const STACK: string[] = [];

  for (const singleChar of s) {
    // The idea is that if the char is opening

    // we should unshift (STACK) it to an array

    // If the char is closing then we should shift (REMOVE THE FIRST ELEMENT)

    // THIS IS BASICALLY A STACK

    switch (singleChar) {
      case "[":
      case "{":
      case "(":
        STACK.unshift(singleChar);
        break;

      case "]":
      case "}":
      case ")":
        const value = STACK.shift();
        if (singleChar === "]" && value !== "[") return false;
        else if (singleChar === "}" && value !== "{") return false;
        else if (singleChar === ")" && value !== "(") return false;

        break;
    }
  }

  return STACK.length === 0;
}

console.log(isValid("()"));
