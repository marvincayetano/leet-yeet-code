function isUgly(num: number): boolean {
  if (num < 1) return false;
  if (num === 1) return true;

  var divisor = [2, 3, 5];

  for (var i = 0; i < divisor.length; i++) {
    while (num && num % divisor[i] === 0) {
      num = Math.floor(num / divisor[i]);
    }
  }

  return num === 1;
}
