function isIsomorphic(s: string, t: string): boolean {
  // Constraint
  if (s.length !== t.length) return false;

  const mapSet: Set<string> = new Set<string>();
  const replacingSet: Set<string> = new Set<string>();
  const replacedSet: Set<string> = new Set<string>();

  const sArray: string[] = s.split("");
  const tArray: string[] = t.split("");

  for (let i: number = 0; i < sArray.length; i++) {
    let key: string = `${sArray[i]} : ${tArray[i]}`;

    if (replacingSet.has(sArray[i])) {
      if (!mapSet.has(key)) {
        return false;
      }
    } else {
      if (replacedSet.has(tArray[i])) return false;
      replacingSet.add(sArray[i]);
      replacedSet.add(tArray[i]);
      mapSet.add(key);
    }
  }

  return true;
}
