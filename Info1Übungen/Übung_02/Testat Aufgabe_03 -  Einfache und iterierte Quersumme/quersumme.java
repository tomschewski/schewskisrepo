public class quersumme {
  public static void main(String[] args) {
    
    // n ist Zahl dessen Quersumme wir bilden und k gibt an ob die normale oder iterierte
    int n = Integer.parseInt(args[0]);
    int k  = Integer.parseInt(args[1]);

    //aufruf der iterierten Quersumme, mit der Rekursiven Funtkion quersumme und der Abbruchsbedinung, dass n<10 sein muss
    if(k!= 0){
      while(n>9) {
        n = quersumme(n);
        if (n>9)
          System.out.println("Fertige zwischen Summe : " + n);
      }
      System.out.println("Iterierte Quersumme : " + n);
    }
    
    //einfacher Aufruf der rekursiven Quersummen Funktion für die normale Quersumme
    else
      System.out.println("Quersumme =  "  + quersumme(n)); 
  }

  //Rekursive Funktion, die sich selber so oft aufruft bis n<=9 und dann die Quersumme aufeinander addiert
  public static int quersumme(int n)  {
    if (n <= 9) {
    return n;
    }
    int temp = quersumme(n/10);
    System.out.println("Temporäre Zwischensumme : " + temp);
    return n%10 + temp;
  }
}
