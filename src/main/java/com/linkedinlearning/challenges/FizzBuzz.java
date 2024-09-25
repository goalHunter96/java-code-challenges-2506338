package com.linkedinlearning.challenges;
//Challenge FizzBuzz - selbst gelöst!
/*
 * durch Zahlen von 1 - 100 iterieren
 * durch 3 teilbar: "Fizz" ausgeben
 * durch 5 teilbar: "Buzz" ausgeben
 * durch 3 und 5 teilbar "FizzBuzz" ausgeben
 * sonst Zahl ausgeben
 */
public class FizzBuzz {
  public static void main(String[] args) {
    int five = 5;
    int three = 3;

    for(int i = 1; i <= 100; i++){

      if (i % three == 0 && i % five == 0) {
        System.out.println("FizzBuzz");
      }else if(i % three == 0){
        System.out.println("Fizz");
      }else if (i % five == 0) {
        System.out.println("Buzz");
      }else{
        System.out.println(i);
      }
    }
  }

}
