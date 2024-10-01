package com.linkedinlearning.challenges;

public class Interface {

  public static void main(String[] args) {
    var triangle = new Dreieck(3, 4, 5);

    System.out.println("Das Ergebnis des Satz des Heron ist: " + triangle.heron());
    System.out.println("Die Fläche des Dreiecks ist: " + triangle.getPerimeter());

  }
}
