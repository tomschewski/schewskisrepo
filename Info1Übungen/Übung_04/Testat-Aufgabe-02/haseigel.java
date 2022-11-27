public class haseigel {
  public static void main(String args[]) { //input can vary between FFFF(65535) and 1000(4096)
    long n = Long.parseLong(args[0]);
    //System.out.println(n);

    if(n > 65535 || n < 4096) {
      System.out.println("Incorrect userinput, programm will now end.");
      System.exit(0);
    }
    for (long i = n; i < n+1; i++) {
      middlesquare(i);
    }
  }

  public static void middlesquare(long n) {
    long igel = n;
    long hase = 0;
    boolean update = false;
    int count = 0;

    while (igel != hase){
      n = n * n;
      System.out.println(n + "   This is n squared");
      n = (n % 0x1000000L) / 0x100;

      if (update){   //update ist true in jeder 2 iteration
        hase = n; //hase nimmt somit jede 2 iteration einen neuen wert an. bzw hase überspringt einen wert pro Änderung
        igel = ((igel * igel) % 0x1000000L) / 0x100; //Igel hingegen bildet mit sich selber die nächste iteration und überspringt somit nichts
      }
      update = !update;
      System.out.println(count + "\t" + n);
      if(igel == 0)
        break;
      count++;
    }
      System.out.println("Found in line : " + (count - 1) / 2);
      System.out.println("Igel : " + igel);
      System.out.println("Hase : " + hase); 
  }
}
