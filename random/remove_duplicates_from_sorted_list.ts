// REMOVE DUPLICATES FROM SORTED LIST

var deleteDuplicates = function (head) {
  if (head === null) {
    return null;
  }

  let current = head;
  while (current.next !== null) {
    // If next value is the same then set the next to the 2nd next
    if (current.val === current.next.val) {
      current.next = current.next.next;
      // Otherwise go to the next iteration
    } else {
      current = current.next;
    }
  }

  return head;
};
