// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

function getRow(rowIndex: number): number[] {
  let res = [];
  let i = 0;
  let j = 0;
  for (i = 0; i <= rowIndex; i++) {
    res.unshift(1);
    for (j = 1; j < i; j++) {
      res[j] += res[j + 1];
    }
  }
  return res;
}
