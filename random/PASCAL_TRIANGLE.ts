function generate(numRows: number): number[][] {
  const res = [];
  const returnArr = [];
  while (res.length < numRows) {
    res.unshift(1);
    for (let i = 1; i < res.length - 1; i++) {
      res[i] += res[i + 1];
    }

    returnArr.push([...res]);
  }

  return returnArr;
}
