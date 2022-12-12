class collatzvermutung {
  public static void main(String args[]) {
    int n = Integer.parseInt(args[0]);
    //Schauen ob es einen zweiten Input gibt und falls ja dann das beschriebene Vorgehen
    try{
      int m = Integer.parseInt(args[1]);
      //checken ob input passt
      if(n>m || n < 0 || m <=0)
        StdOut.println("Wrong Input!");
    
      //für n bis m prüfen ob es stimmt  "
      for(int i = n; i <= m; i++) {
        int [] arr = collatziterativ(i);
        if(arr[arr.length-1] == 1){
          continue;
      }
        //falls nicht, fehlermeldung und abbruch
        else{
          StdOut.println("Does not prove!" + arr[arr.length-1]);
          return;
        }
      }
    StdOut.println("Proven right from : " + n + " " + m);
    }
    //Falls nur ein Input dann anderer Fall
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
    //so viele iterationen bis n == oder i == intmax als abbruchsbedingungen
    for(int i = 1; i<Integer.MAX_VALUE; i++) {
      if (n == 1 || n == Integer.MAX_VALUE)
      break;
      
      //n anpassen nach den Regeln
      if (n % 2 == 0)
      n = n/2;

      else
      n = 3 * n + 1;
      System.out.println(i + "\t" + n);
    }
  }

  static int [] collatziterativ(int n){
      //liste nur mit startwert n enthalten erzeugen
      int [] collatzlist = {n};
      // jetzt solange machen bis i == intmax oder n == 1
      for(int i = 1; i<Integer.MAX_VALUE; i++) {
        if (n == 1 || n == Integer.MAX_VALUE)
        break;
        //n modifizieren wie gefordert
        if (n % 2 == 0)
        n = n/2;

        else
        n = 3 * n + 1;
      // jeden wert von n an den array appenden 
        collatzlist = appendInt(collatzlist, n);
      }
      return collatzlist;
    }

  public static int[] appendInt(int[] a, int n) {
    //länge der alten liste + 1 als länge für die neue Liste festlegen
    int [] collatzlist = new int[a.length + 1];
    // elemente der alten liste in die neue machen
    for(int i = 0; i < a.length; i++) {
      collatzlist[i] = a[i];
    }
    // letztes element hinzufügen und dann fertige liste returnen
    collatzlist[a.length] = n;
    return collatzlist;
  }
}
