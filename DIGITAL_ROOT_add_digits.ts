function addDigits(num: number): number {
  let sum = num;
  let arr = [];

  while (sum > 9) {
    arr = sum.toString().split("");
    sum = arr.reduce((a: string, b: string) => parseInt(a) + parseInt(b));
  }

  return sum;
}
