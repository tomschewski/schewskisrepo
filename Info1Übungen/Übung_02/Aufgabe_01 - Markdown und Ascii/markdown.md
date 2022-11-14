# Informatik I, Übung 92, Aufgabe 2

Markdown und AsciiMath

## Größter gemeinsamer Teiler (ggT)

# Das ggT-Problem

**Gegeben.** Zwei positive ganze Zahlen a, b $in ZZ% mit a,b > 0.

**Gesucht.** Eine positive ganze Zahl d $in ZZ$ mit d > 0 und folgenden Eigenschaften.

- d teilkt a und b ohne Rest
- es gibt keine ganze Zahl d' $in$ $ZZ$ mit d' > d, die a und b ohne Rest teilt

# Der Euklidischer Algirithmus (klassisch)

**Eingabe.** zwei ganze Zahlen a,b mit a > b $>=$ 0

**Initialisierung.** x $<-|$ a, y $<-|$ b

**Iteration.** wiederhole das Folgende solange y $!=$ 0 gilt

- falls (x > y) dann x $<-|$ x - y
- sonst y $<-|$ y - x

**Abschluss.** d $<-|$ z

**Rückgabe.** d

Hinweis. A $<-|$ B steht für: speichere aktuellen Wert von B in A.

# Euklidischer Algorithmus in Java

    // Eklidischer Algorithmus (klassisch)
    // Eingabe von a und b
    // Initialisierung
    int x = a;
    int y = b;
    // Iteration
    while (y != 0) { // ’!=’ steht fuer ’ungleich’
    if (x > y)
    x = x - y;
    else
    y = y - x;
    }
    // Abschluss
    int d = x
    // Rückgabe von d
