package com.linkedinlearning.challenges;

public class Dreieck implements Shape{
  /*
   * Erstelle eine Klasse namens Triangle, die ein Dreieck repräsentiert
   * Triangle soll das Interface Shape implementieren
   * Dem Konstruktor werden die 3 Seitenlängen übergeben
   * Die Berechnung der Fläche erfolgt mit dem Satz des Heron
   * Methoden der Klasse Math können helfen
   */
  private final int a;
  private final int b;
  private final int c;

  public Dreieck(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

  public double getPerimeter() {
    return a + b + c;
  }

  public double heron() { // Heron-Formel nachschauen oder chatGPT
    return ((double) 1 / 4) * Math.sqrt(((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c)));
  }
}
