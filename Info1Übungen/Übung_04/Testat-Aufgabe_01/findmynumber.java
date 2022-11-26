class findmynumber {
  public static void main(String agrs[]) {

    for (int i = 1; i < 1000; i++) {
      if(i % 6 == 0)
        if(i % 7 == 0)
          if(i % 4 != 0)
            if(quersumme(i) == 6)
              System.out.print(i);
    }
    System.out.println();
    
  }

  public static int quersumme(int n)  {
    if (n <= 9) {
    return n;
    }
    int temp = quersumme(n/10);
    return n%10 + temp;
  }
} 
