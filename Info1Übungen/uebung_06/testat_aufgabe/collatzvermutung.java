class collatzvermutung {
  public static void main(String args[]) {
    int n = Integer.parseInt(args[0]);
    try{
      int m = Integer.parseInt(args[1]);
      if(n>m || n < 0 || m <=0)
        StdOut.println("Wrong Input!");
    
      for(int i = n; i <= m; i++) {
        int [] arr = collatziterativ(i);
        if(arr[arr.length-1] == 1){
          continue;
      }
        else{
          StdOut.println("Does not prove!" + arr[arr.length-1]);
          return;
        }
      }
    StdOut.println("Proven right from : " + n + " " + m);
    }
    catch(Exception e) {
      collatziterativoutput(n);
      int [] arr = collatziterativ(n);
      StdOut.println("\nThis is the array : \n");
      for(int i = 0; i < arr.length; i++){
        StdOut.println(arr[i]);
      }
    }
  }

  static void collatziterativoutput(int n) {
    System.out.println("0 \t" + n);
    for(int i = 1; i<Integer.MAX_VALUE; i++) {
      if (n == 1 || n == Integer.MAX_VALUE)
      break;
      
      if (n % 2 == 0)
      n = n/2;

      else
      n = 3 * n + 1;
      System.out.println(i + "\t" + n);
    }
  }

  static int [] collatziterativ(int n){
      int [] collatzlist = {n};
      for(int i = 1; i<Integer.MAX_VALUE; i++) {
        if (n == 1 || n == Integer.MAX_VALUE)
        break;
      
        if (n % 2 == 0)
        n = n/2;

        else
        n = 3 * n + 1;
        collatzlist = appendInt(collatzlist, n);
      }
      return collatzlist;
    }

  public static int[] appendInt(int[] a, int n) {
    int [] collatzlist = new int[a.length + 1];
    for(int i = 0; i < a.length; i++) {
      collatzlist[i] = a[i];
    }
    collatzlist[a.length] = n;
    return collatzlist;
  }
}
