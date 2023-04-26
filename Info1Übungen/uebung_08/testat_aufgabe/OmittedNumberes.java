public class OmittedNumberes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);	// Bereichgröße
        boolean[] numbers = new boolean[n];	// Stelle 0 im Array steht für 1 usw.
        
        // Iteriert für jede Zahl > 2
        for (int i = 2; i < n; i++) {
            // Streich von den Verbleibenden jede i-te
            int count = i;
            for (int j = 0; j < n; j++) {
                if (!numbers[j])
                    count--;
                    
                // Eine Zahl wird gestrichen
                if (count == 0) {
                    numbers[j] = true;
                    count = i;
                }
            }
        }
        
        // Alle nicht gestrichenen Zahlen werden ausgegeben
        for (int i = 0; i < n; i++) {
            if (!numbers[i])
                System.out.println(i+1);
        }
    }
}
