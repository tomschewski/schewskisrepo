public class haseigel {
  public static void main(String args[]) { //input can vary between FFFF(65535) and 1000(4096)
    
    long hase = 0;
    long igel = 0;

    for (int i = 4096; i < 65535; i++) {
      hase = middlesquareigel(i);
      igel = middlesquareigel(i);
      //System.out.println("This is Hase : " + hase + ". This is Igel : " + igel + ". This is j : " + i);
      for (int j = 1; j < 10; j++) {
        igel = (middlesquareigel(igel*igel));
        hase = (middlesquarehase(hase*hase));
        //System.out.println("This is igel : " + igel + ". This is hase : " + hase);
        if (hase == 0)
          break;
        if(igel == hase && igel != middlesquareigel(igel*igel)){
          System.out.println("This i has a loop! : " + i + ". This is Igel and Hase : " + igel + " " + hase + ". This is j : " + j);
          break;
        }
      }
    }
  }

  public static long middlesquarehase(long j) {
    long hase = 0;
    j = j * j;
      
      for (int i = 0; i < 2; i++) {
        j = j / 16;
        hase = j - (j/256) * 256;  
        j = hase * hase;
      }
    return hase;
  }
  public static long middlesquareigel(long j) {
    j = j * j;
    long igel = 0;
    j =  j / 16;
    igel = j - (j/256) * 256;
    return igel;
  }

}
