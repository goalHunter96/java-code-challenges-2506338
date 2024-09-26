package com.linkedinlearning.challenges;
/*
 * Programm schreiben, dass alle Primzahlen in einem vorgegebenen, abgeschlossenen Intervall findet
 * Primzahl: eine natürliche Zahl größer 1, die ausschließlich durch sich selbst und 1 teilbar ist
 * Ein abgeschlossenes Intervall beinhaltet die untere und obere Grenze
 */
public class PrimeNumberFinder {
   public static void main(String[] args) {
    primeFinder();
   }

   static void primeFinder(){

      for(int i = 1; i <= 25; i++){
        if (i <= 1) {
          continue; //Damit überspringt das Programm i, da es kleiner gleich 1 und somit keine Primzahl ist. Nicht i++ sondern continue verwenden.
        }
        
        boolean prime = true;

            for(int j = 2; j <= Math.sqrt(i); j++){ //Die innere Schleife muss von 2 bis zum Quadratwurzel von i laufen. Nicht i*i sondern Math.sqrt(i) verwenden.
               if (i % j == 0) {
                prime = false;
                break; // Wenn Teiler gefunden wird, soll das Programm abbrechen.
               }
            }
            if (prime) {
              System.out.println(i); //Primzahl wird ausgegeben.
            }
      }
   }
}
