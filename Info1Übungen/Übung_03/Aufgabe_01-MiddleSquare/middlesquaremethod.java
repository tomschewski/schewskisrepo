class middlesquaremethod {
  public static void main(String args[]) {

    int n = 0;
    while(true) {
      StdOut.println("Please enter your starting number : ");
      n = StdIn.readInt();

      if (n<0 || n>99){
        StdOut.println("Your input was invalid, try again.");
        continue;
        }

      StdOut.println("Your starting Number is : " + n);
      break;
    }

    for (int i = 0; i < 102; i++) {
      n = n * n;

      if (n > 1000){
        n = n % 1000;
        n = n / 10;
        StdOut.println(n);
      }
      
      else if (n < 1000) {
        n = n / 10;
        StdOut.println(n);
      }
    }
  }
}
