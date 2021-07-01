## 1. Aufgabe
Mithilfe des Algorithmus von Euklid kann der größte gemeinsame Teiler (ggT) zweier Zahlen sehr
einfach rekursiv berechnet werden. Nach Euklid gilt für zwei natürliche Zahlen a und b folgendes:

ggT(a, 0) = a

ggT(a, b) = ggT(b, a mod b)

Implementieren Sie ein Programm, das den ggT für zwei als Argumente übergebene natürliche
Zahlen rekursiv (siehe oben) oder iterativ (recherchieren Sie dazu ein wenig) berechnet. Schreiben
Sie dazu das Interface GgT mit der Methode long berechneGgt(long a, long b) sowie die beiden
Klassen GgtRekursiv und GgtIterativ, die beide das Interface GgT implementieren.

## 2. Aufgabe
Palindrome sind Worte oder allgemein Zeichenketten, die von links als auch von rechts gelesen
identisch sind. Beispiel sind Otto, Reittier oder Rentner.

(a) Implementieren Sie ein Programm, welches für einen gegebenen Eingabestring feststellt, ob
dieser ein Palindrom ist oder nicht. Zur Eingabe des zu untersuchenden Strings soll ihr Programm zwei Möglichkeiten bieten. Zum einen soll der Eingabestring beim Programmaufruf als
Argument übergeben werden können. Zum anderen soll es aber auch möglich sein, Eingabestrings zeilenweise aus einer Textdatei zu lesen.
Das Problem kann sowohl iterativ als auch rekursiv gelöst werden. Implementieren Sie beide
Lösungen. Entwerfen Sie ihr Programm so, dass es leicht um weitere Algorithmen zur Lösung
des Problems erweiterbar ist.
Beachten Sie unbedingt folgende Implementierungsdetails:
- Erzeugen Sie ein Interface Palindrom mit der Methode boolean istPalindrom(String wort).
- Nennen Sie die erste Implementierung PalindromRekursiv.
- Nennen Sie die zweite Implementierung PalindromIterativ.
- 
(b) Erzeugen Sie eine Datei mit zwei kleinen Messreihen (iterative und rekursive Implementierung),
welche die Geschwindigkeit der Berechnung für verschiedene Problemgrößen (Länge der
Strings) misst und als Comma-separated values in eine Textdatei schreibt.

(c) Nutzen sie diese Messreihen und tragen Sie sie in einem Diagramm gegeneinander ab. Zum
Beispiel so wie in Abbildung 1 dargestellt. Entscheiden Sie selbst, bis zu welcher Problemgröße Sie Messungen durchführen. Bei der Präsentation ihrer Lösung sollten Sie in der Lage
sein, die gemessenen Effekte zu erklären. Führen Sie Messungen für ihre iterative und ihre
rekursive Lösung durch

![image](https://user-images.githubusercontent.com/69506130/124187103-95b0d400-dabd-11eb-834f-46522e7a3be1.png)

Abbildung 1: Beispiel für eine Messreihe zum Vergleich der iterativen und der rekursiven Implementierung.

Hinweise:
- Bei der Geschwindigkeitsmessung kann die Klasse System.nanoTime() hilfreich sein.
- Zur Erzeugung des Diagramms in Teilaufgabe c kann ein beliebiges Tabellenkalkulationsprogramm verwendet werden. Eine andere Möglichkeit, die jedoch mehr Einarbeitungsaufwand
erfordert, ist beispielsweise die Nutzung von Gnuplot .
