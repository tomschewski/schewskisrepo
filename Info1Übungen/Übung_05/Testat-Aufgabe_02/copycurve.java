public class copycurve {
  public static void main(String[] args){
    double[] current = {0,0};
    double[] next = {1,0};
    int ausrichtung = 0;
    int maxlen = 0;
    
    int n = StdIn.readInt();
    String input = StdIn.readString(); 
    Character[] charlist = input.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
    
      //ermittlung wie viele F
    for(int i = 0; i<n; i++){
      if (charlist[i] == 'F')
        maxlen += 1;
    }

    StdDraw.setXscale(-maxlen,maxlen);
    StdDraw.setYscale(-maxlen,maxlen);
    // draw loop
    for(int i = 0; i < n; i++){
      StdOut.print("This is current pos : " + current[0] + "\t" + current[1] + "\t");
      StdOut.print("This is next pos : " + next[0] + "\t" + next[1] + "\t");
      StdOut.println("This is the next char : " + charlist[i]);

      if(charlist[i] == 'F') {
        StdDraw.line(current[0], current[1], next[0], next[1]);
        current[0] = next[0];
        current[1] = next[1];
        continue;
      }

      if(charlist[i] == 'L'){
        if(ausrichtung == 0){
          ausrichtung = -3;
        }
        else if(ausrichtung < 0){
          ausrichtung += 1;
        }
        else
          ausrichtung -= 1;
      }
      if(charlist[i] == 'R'){
        if(ausrichtung == 3)
          ausrichtung = 0;
        else if(ausrichtung < 0)
          ausrichtung -= 1;
        else
          ausrichtung += 1;
      }

      if(ausrichtung == 0){
        next[0] = current[0]+1;
        next[1] = current[1];
      }
      if(ausrichtung == 1 || ausrichtung == -1){
        next[0] = current[0];
        next[1] = current[1]-1;

    }
      if(ausrichtung == 2 || ausrichtung == -2){
        next[0] = current[0]-1;
        next[1] = current[1];

      }

      if(ausrichtung == 3 || ausrichtung == -3){
        next[0] = current[0];
        next[1] = current[1]+1;
    }
    }
  }
}
