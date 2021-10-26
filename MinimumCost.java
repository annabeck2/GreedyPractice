class MinimumCost {
 public static int minCost(int[] pipes) {
  int cost = 0;
  int n = pipes.length;
  Arrays.sort(pipes);
  for (int i = 0; i < n - 1; i++) {
   int prev_cost = cost;
   cost = (pipes[i] + pipes[i + 1]);
   pipes[i + 1] = cost;
   cost = cost + prev_cost;
  }
  return cost;
 }
}
