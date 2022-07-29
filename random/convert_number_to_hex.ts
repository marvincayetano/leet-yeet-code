function toHex(num: number): string {
  if (num == 0) return "0";
  let hex = "0123456789abcdef";
  let result = "";
  let count = 8;
  while (count && num) {
    let c = hex[num & 15]; // map last 4 bits to a hex digit
    result = c + result;
    num = num >> 4;
    count--;
  }
  return result;
}
