# Aufgabe 1 - Typecasting  

### 1.  
Die Ausgaben des Codes sind :  
1 : 73, da a einfach als 73 definiert wird und geprintet wird ohne verändert zu werden.  
2 : 219, da b einfach als 219 definiert wird und geprintet wird ohne verändert zu werden.  
3 : 292, da a + b = 292.
4 : 36, 36 ist der Wert der übrig bleibt, wenn man 292 auf eine Byte-Darstellung kürzt. Es bleiben nur wenige Bits übrig die 36 ergeben.  
5 : -3, da e einfach als -3 definiert wird und geprintet wird ohne verändert zu werden.  
6 : 65533, da ???
7 : 1, da g einfach als 1 definiert wird und geprintet wird ohne verändert zu werden.  
8 : 4, da h einfach als 4 definiert wird und geprintet wird ohne verändert zu werden.  
9 : 0, da 1/4 bei einer Int-Division 0 ergibt, und 0*4 = 0.  

### 2.  
Es wird ein Typecasting verlangt, da wir c selber als short definiert haben und es zu einem Datenverlust kommen könnte, wenn man zwei shorts addiert.  
Sind a und b z.B. 32767(short.max.value) und 300, so wäre das Ergebniss größer als die Zahl welche eine Short-Variable darstellen kann und es würde einen Fehler geben.  

# Aufgabe 2 - Disassembly, Capture the Flag
Die einfachste Methode ist "javap -constants Test", hier werden alle im Programm definierten konstanten Variablen angezeigt. Hier wird als Ausgabe :  
"public static final int passwort = 42:" geliefert. Dies entspricht dem Passwort zum knacken von Test.class. Alternativ kann man alle Variablen welche temporär im Verlauf des Programmes benutzt wurden ausprobieren mit "javap -l Test". Hier ist ebenfalls die 42 enthalten und man kann auch so Test.class knacken.  

# Aufgabe 3 - Binärbrüche  

### 1.  
10100001,0101 Basis 2 = 161,3125 Basis 10. Falls der '.' mit dazu gehört : 10100001,0101. Basis 2 = 161,0101 Basis 10.  
*Zahl vor dem Komma*   
$1*2^7 = 128$  
$0*2^6 = 0$  
$1*2^5 = 32$  
$0*2^4 = 0$  
$0*2^3 = 0$  
$0*2^2 = 0$  
$0*2^1 = 0$  
$1*2^0 = 1$  

*Nachkommastellen*  
$0*2^-1 = 0$  
$1*2^-2 = 0,25$  
$0*2^-3 = 0$  
$1*2^-4 = 0.0625$  
Bildet man nun die Summe aller Terme, so erhält man : 10100001,0101 Basis 2 = 161,3125 Basis 10.  

### 2.  
*Zahl vor dem Komma*
$4 % 2 = 2, R = 0$  
$2 % 2 = 1, R = 0$  
$1 % 2 = 0, R = 1$  

*Nachkommastellen*
$0,765625 * 2 = 1,53125$
$0,53125 * 2 = 1,0625$
$0,0625 * 2 = 0,125$
$0,125 * 2 = 0,25$
$0,25 * 2 = 0,5$
$0,5 * 2 = 1$

4,765625 Basis 10 = 100,110001 Basis 2.

# Aufgabe 4 - Equivalante Schleifen  

### 1.  
    int i = 12;
    while(i>5){
        k *= 3;
        i /= 2;
    }

### 2.  
    for(int i=4; i>=1; i--){
        k =- 2*k
    }