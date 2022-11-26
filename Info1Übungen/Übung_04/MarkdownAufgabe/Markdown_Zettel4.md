# Aufgabe 1 - Zahlensysteme

**A)** Übertragen sie die Zahl $83965$ in folgende Zahlensysteme:

**1. Binärsystem :**  
$83965 % 2 = 41982, R = 1$  
$41982 % 2 = 20991, R = 0$  
$20991 % 2 = 10495, R = 1$  
$10495 % 2 = 5247, R = 1$  
$5247 % 2 = 2623, R = 1$  
$2623 % 2 = 1311, R = 1$  
$1311 % 2 = 655, R = 1$  
$655 % 2 = 327, R = 1$  
$327 % 2 = 163, R = 1$  
$163 % 2 = 81, R = 1$  
$81 % 2 = 40, R = 1$  
$40 % 2 = 20, R = 0$  
$20 % 2 = 10, R = 0$  
$10 % 2 = 5, R = 0$  
$5 % 2 = 2, R = 1$  
$2 % 2 = 1, R = 0$  
$1 % 2 = 0, R = 1$

Somit ist $83965$ in Binär $10100011111111101$.

**2. Oktalsystem :**  
$83965 % 8 = 10495 , R = 5$  
$10495 % 8 = 1311, R = 7$  
$1311 % 8 = 163, R = 7$  
$163 % 8 = 20, R = 3$  
$20 % 8 = 2, R = 4$  
$ % 8 = 0, R = 2$

Somit ist $83965$ in Oktal $243775$.

**3. Hexadezimal :**  
$83965 % 16 = 5247 , R = 13 = D$  
$5247 % 16 = 327, R = 15 = F$  
$327 % 16 = 20, R = 7$  
$20 % 16 = 1, R = 4$  
$1 % 16 = 0, R = 1$

Somit ist $83965$ in Hexadezimal $147FD$.

**B)** Übertragen sie die Zahl $11011111$ in folgende Zahlensysteme :

**1. Dezimalsystem :**  
$11011111 = 1 * 2^0 + 1 * 2^1 + 1 * 2^2 + 1 * 2^3 + 1 * 2^4 + 0 * 2^5 + 1 * 2^6 + 1 * 2^7 = 223$

Somit ist $11011111$ im Deziamlsystem $223$.

**2. Oktalsystem :**  
$223 % 8 = 27, R = 7$  
$27 % 8 = 3, R = 3$  
$3 % 8 = 0, R = 3$

Somit ist $11011111$ bzw. $223$ im Oktalsystem $337$.

**3. Hexadezimalsystem :**  
$223 % 16 = 13, R = 15 = F$  
$13 % 16 = 0, R = 13 = D$

Somit ist $11011111$ bzw. $223$ in Hexadezimal $DF$.

# Aufgabe 2 - Codierung von Sprachen

**1. a) :**  
Insgesamt braucht man 5 Bits um jeden Glypehn einzeln zu codieren, da es 22 sind es das kleinste n für $22 < 2^n$ zu suchen.  
Das kleinste n, welches die Gleichung erfüllt ist $5$, da $2^5= 32$. Dementsprechend braucht man $5$ Bits um alle Glyphen einzeln zu codieren.

**1. b) :**  
Wenn man die Glyphen als paare codieren will, so muss man alle möglichen Kombinationen der Glyphen codieren. Diese beläuft sich auf $22*22 = 484$ verschiedene Kombinationen.
Um herauszufinden wieviele Bits man braucht sucht man nun wieder das kleinste für $484 < 2^n$.  
Dieses n ist hier $9$, da $2^9 = 512$. Somit braucht man 9 Bits zum codieren aller Paare.

**1. c) :**  
Diese in **1. b)** beschriebene Methode spart für jede 2 Glypen eines Ausdruckes 2 Bits. Würde man ein Wort, welches aus 4 Glyphen besteht mit einzeln codierten Glyphen darstellen, so bräuchte man dafür $20$ Bit, da $4*5 = 20$. Benutzt man die Paar-Codierung, so benötigt man nur 18 Bits, da $2*9 = 18$. Somit spart die Paar-Codierung Bits.

**2. a) :**  
Wir haben die originalen 22 Zeichen bereits mit 5 Bit codiert. Mit diesen 5 Bit kann man bis zu 32 Elemente speicher, somit bräuchten wir ebenfalls nur 5 falls wir auch die Zahlen zusätzlich noch einzeln codieren wollen.

**2. b) :**  
Man muss hier betrachten, dass jedes Zeichen zusammen mit der End-Glyphe kombiniert werden muss. Da diese Glyphe eine der ursprünglichen 22 ist, haben wir mindestenstens schonmal die $484$ Kombinationen aus Aufgabe **1. b)**. Dazu kommen nun alle Zahlen einzeln und alle Zahlen einzeln in Kombination mit der End-Glyphe oder man codiert die End-Glyphe nochmal einzelnd um sie so an jede einzeln codierte Zahl anhängen zu können. Da wir 4 Zahlzeichen haben brauchen wir nur 4 neue Codierungen plus das Endzeichen einzeln. Somit sind es insgesamt $489$ zu codierende Elemente. Hierfür würden 9 Bits weiterhin reichen. Man könnte außerdem noch die 22 Kombinationen, inwelchen das Endzeichen zuerst steht entfernen, so müsste man sogar nur $467$ Elemente codieren. Die Aufgabenstellung sagt jedoch das Glyphen Paarweise codiert werden und Zahlen einzeln, dementsprechend erfüllt keiner meiner Ansätze die Aufgabenstellung. Die Aufgabe ist schlecht gestellt, dementsprechend ist das hier einfach mein bester Ansatz.

**2. c) :**  
Ergibt keinen Sinn, siehe Erklärung **2. b)**.

**2. d) :**  
Ich sehe nicht inwiefern die codierung von Tripplets Sinn ergibt.

**2. e) :**  
Siehe **2. d)**

# Aufgabe 3 - Compilierfehler

**1.** Folgende Zeilen funktionieren nicht im ersten Beispiel :

1. Zeile 1, Fehler : Der Wert, welcher n1 zugewiesen werden soll ist zu groß um ihm einer Temporären Int Variable, geschweige denn n1 zuzuweisen.
2. Zeile 2, Fehler : Der Wert, welcher n2 zugewiesen werden soll passt in eine long Variable, jedoch nicht in die temporäre Variable welche genutzt wird,
   um die $3000000000$ n2 zuzuweisen.
3. Zeile 4, Fehler : Hier ist die Übertragung des Float Datentypes zu Long problematisch, da es zum Datenverlust führen könnte. Dementsprechend kompiliert das Programm nicht.

Zeile 3 funktioniert, da die Temporäre Variable für $3000000000$, welche dann n3 zugewiesen werden soll als Long Variable initialisiert wird.
Dieser Variablen Typ kann diese Zahl ohne Probleme speichern, da er mehr Bit benutzt.

**2.** Folgende Zeilen funktionieren nicht im ersten Beispiel :

1. Zeile 3, Fehler : Der Wert, welcher n3 zugewiesen werden soll passt in eine long Variable, jedoch nicht in die temporäre Variable welche genutzt wird,
   um die $3000000000$ n2 zuzuweisen. Auch der Befehl (long) spielt hier keinen Unterschied da dieser nur dafür sorgt, dass die temporäre Varible zu einem bestimmten Datentyp, trotz möglichen Datenverlustes zwanghaft konvertiert wird.

Die anderen Zeilen funktionieren, da : Ein möglicher Datenverlust, welcher zum Compilierungsfehler wie in Zeile 1 führt durch das (int) ignoriert wird.
Die temporären Variablen anders als mit dem standard Int initialisiert werde. Z.B. als Float Variable oder durch eine kürzere Schreibweise durch Potenzen.
