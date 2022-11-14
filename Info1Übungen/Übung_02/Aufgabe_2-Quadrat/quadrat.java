public class quadrat {
  public static void main( String[] args) {
    int n = Integer.parseInt(args[0]);
    int sum = 0;

    for (int i = 0; i < n*n/n; i++) {
      sum += 1 + 2 * i;
    }
    System.out.println("Die Summe der ungraden Zahlen kleiner " + n + " bzw. n Quadrat ist gleich : " + sum);
  }
}
