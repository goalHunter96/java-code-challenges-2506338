package com.linkedinlearning.challenges;

import java.util.Arrays;

/*
 * Programm schreiben, dass alle Primzahlen in einem vorgegebenen, abgeschlossenen Intervall findet
 * Primzahl: eine natürliche Zahl größer 1, die ausschließlich durch sich selbst und 1 teilbar ist
 * Ein abgeschlossenes Intervall beinhaltet die untere und obere Grenze
 * Das Ergebnis soll als ein Array zurückgegeben werden
 */
public class PrimeNumberFinder {
  public static void main(String[] args) {
    int[] find = primeFinder(1, 25);
    System.out.println(Arrays.toString(find));
  }

  static int[] primeFinder(int start, int ende) {
    int[] prime = new int[ende - start + 1];
    int found = 0;

    for (int i = start; i <= ende; i++) {
      if (isPrimeNumber(i)){
        prime[found] = i;
        found++;
      }
    }
    int [] primeResult = new int[found];
    
    for(int i = 0; i < primeResult.length; i++){
      primeResult[i] = prime[i]; // Damit das Ergebnis Array nur die gesuchten Primzahlen hat. Sonst erscheinen Nullen in den Index, wie keine Primzahl ist.
    }

    return primeResult;
  }

  static boolean isPrimeNumber(int a) { // Methode zur Überprüfung ob a Primzahl ist
    
    if (a <= 1) {
      return false;
    }

    for (int j = 2; j <= (a / 2); j++) { 
                                         
      if (a % j == 0) {
        return false;
      }
    
    }
        return true;
  }
}

/*
 * VERSION 1 ohne ein Array auszugeben. Wusste nicht dass man als Array ausgeben soll. :/
 * int index = 0;
 * for(int i = start; i <= ende; i++){
 * if (i <= 1) {
 * continue; //Damit überspringt das Programm i, da es kleiner gleich 1 und
 * somit keine Primzahl ist. Nicht i++ sondern continue verwenden.
 * }
 * 
 * boolean prime = true;
 * 
 * for(int j = 2; j <= Math.sqrt(i); j++){ //Die innere Schleife muss von 2 bis
 * zum Quadratwurzel von i laufen. Nicht i*i sondern Math.sqrt(i) verwenden.
 * if (i % j == 0) {
 * prime = false;
 * break; // Wenn Teiler gefunden wird, soll das Programm abbrechen.
 * }
 * }
 * if (prime) {
 * System.out.println(i); //Primzahl wird ausgegeben.
 * }
 * }
 * return result;
 */