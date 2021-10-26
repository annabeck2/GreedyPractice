class ChangeMachine 
{
  // a public collection of available coins
  public static int [] coins = {25, 10, 5, 1}; 

  public static  ArrayList<Integer> getMinCoins(int amount)  // function to recieve change in the form of coins
  {
    ArrayList<Integer> change = new ArrayList<Integer>();
    for (int i = 0; i < coins.length && amount > 0; i++) {
      while (amount >= coins[i]) {
        amount  = amount - coins[i];
        change.add(coins[i]);
      }
    }
    return change;

  }
}
