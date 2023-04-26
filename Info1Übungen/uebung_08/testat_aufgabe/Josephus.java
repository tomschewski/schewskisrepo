public class Josephus {
    // Erstellt Array und füllt das mit 0en
    static int[] josephusPermutation(int length, int step) {
        int[] circle = new int[length];
        for (int number : circle) {
            number = 0;
        }
        // Called recursion
        josephusRecursive(circle, length - 1, step);
        
        return circle;
    }
    
    // Entfernt eine Zahl vom Kreis und schreibt an die Stelle die Runde des Entfernens
    static void josephusRecursive(int[] circle, int last, int step) {
        // printC(circle);
        
        int pos = last;  
        // Schritte gehen (pos ist Position im Kreis und wird schrittweise erhöht)
        int stepsLeft = step;
        while (stepsLeft > 0) {
            pos = (pos + 1) % circle.length;
            if (circle[pos] == 0)
                stepsLeft--;
        }
        // Aus Kreis entfernen
        circle[pos] = circle[last] + 1;
        // Abbruchbedingung
        if (circle[pos] != circle.length)
            josephusRecursive(circle, pos, step);
    }
    
    static void printC(int array[]) {
        for (int number : array) {
            System.out.print(number + " ");
        } System.out.println();
    }
    
    // Nimmt Parameter
    public static void main(String[] args) {
        int l = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        
        // Printet 1 - n
        for (int i = 0; i < l; i++) {
            System.out.print(i+1 + " ");
        } System.out.println();
        // Called permutation
        int[] per = josephusPermutation(l, s);
        // Printet permutation
        for (int number : per) {
            System.out.print(number + " ");
        } System.out.println();
    }
}
