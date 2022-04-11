function convertToTitle(columnNumber: number): string {
  let num = columnNumber;
  let tmp = 0;
  let res = "";

  while (num > 0) {
    tmp = num % 26;
    if (tmp === 0) tmp = 26;
    res = getChar(tmp) + res;
    num = (num - tmp) / 26;
  }
  return res;
}

const getChar = function (num) {
  const start = "A".charCodeAt(0);
  return String.fromCharCode(start + num - 1);
};
