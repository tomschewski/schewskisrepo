class isbn10 {
  public static void main(String args[]) {
    
    int n = Integer.parseInt(args[0]);
    int nquer = wikiquersumme(n);
    int nervquer = nervigealternative(wikiquersumme(n));
    System.out.println("Itquersumme von : " + n + " = " + nquer % 11 + " Nervige Quersumme : " + nervquer);

  }

  public static int wikiquersumme(int n) { // Wikepedia Version

    int sum = 0;
    for (int i = 9; i != 0; i--) {
      sum += n % 10 * i;
      n = n/10;
      //System.out.println("Sum : " + sum + " n % 10 " + n%10);
    }  

    return sum;
  }

  public static int nervigealternative(int n) {
  
    int pos = 0;
    int neg = 0;

    for (int i = 0; i < 10; i++) {
      if(i % 2 == 0){
        pos += n % 10;
      }

      else{
        neg -= n % 10;
      }
      n = n / 10;
    }
    int sum = pos + neg;
    System.out.println("This is pos and neg : " + pos + " ; "+ neg + " and this is sum : " + sum);
    if(sum >= 11)
      sum = nervigealternative(sum);

    while(sum<0)
      sum += 11;
    return sum;
  }
}
