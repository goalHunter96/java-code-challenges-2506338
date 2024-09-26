package com.linkedinlearning.challenges;

public class ArithmeticMean {
  //Gegeben ist ein Array mit natürlichen Zahlen (Intergers)
  //Berechne das arithmetische Mittel (ArithmeticMean)
  //Quotient aus Summe der betrachteten Zahlen und deren Anzahl
  public static void main(String[] args) {
    int [] values = {1, 2, 3, 4, 5, 21, 9, 6};
    int summe = 0;
    int aMean = 0;
    
    for (int i : values) {
       summe += i; 
    }
    int anzahl = values.length;
    
    aMean = summe / anzahl;
    System.out.println();
    System.out.println("Das arithmetische Mittle ist: " + aMean);
    
  }

}
