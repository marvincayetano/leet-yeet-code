function detectCapitalUse(word: string): boolean {
  // Constraint where all capital is valid
  if (word.toUpperCase() === word) {
    return true;
  }
}
