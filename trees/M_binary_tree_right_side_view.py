"""
  Get all the values when looking at the right side
  What if you can view more nodes in the left side because they're not being blocked
  Well we can count the maximum depth from the right side, then if we reach the max depth
  we try to get the next one and just iterate using the maximum depth
  This is DFS,
  BFS level order traversal is easier it seems. we get the right most value everytime
"""