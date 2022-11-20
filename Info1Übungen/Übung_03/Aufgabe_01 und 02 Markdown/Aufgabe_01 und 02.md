# Aufgabe 01 - Markdown und Ascii

## Osterdatum

### 1 Schritt :
Sei zu Ostern berechenende Jahr n
Dieses gilt es mit 19, 4 und 7 ganzzahlig zu dividieren :  
$n % 19 = a$ ; $n % 4 = b$ , $n % 7 = c$  

### 2 Schritt :  
Anschließend dividiert man $(19a + 23) / 30 = d$

### 3 Schritt :  
Zuletz dividiert man, wenn das Jahr zwischen 1700 und 1799 liegt :  
$(2b + 4c + 6d + 3) / 7 = e$  
Sollte das Jahr zwischen 1800 und 1899 liegen so dividiert man :  
$(2b + 4c + 6d + 4) / 7 = e$  

Letztlich kann man somit den Ostertag berechnen. Ist $d + e < 9$ so gilt :  
Osterag $= 22 + d + e$ März, ist $d + e > 9$ der Fall, so gilt :  
Ostertag $= d + e - 9$ März.

# Aufgabe 02 - Programmablauf verstehen

## Count-Funktion

Zu beginn ist i in Zeile 2 als 10 definiert. Die if-Bedinung in Zeile trifft somit zu und count wird ein erstes mal aufgerufen. Die zweite if-Bedinung in Zeile 5 stimmt somit ebenfalls und führt
zum zweiten Aufruf von Count. In der While-Schleife in Zeile 7 wird count insgesamt noch zwei mal aufgerufen, da i erst 10 und dann 15 ist und wenn i == 20 ist die Schleife beendet.  
Der Rest des Programmes hat keine Relevanz mehr da keine If-oder Schleifen-Bedinung zutrifft.  
Somit wurde die Count-Funktion insgesamt vier mal aufgerufen.